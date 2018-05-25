package com.muhammad.android.learnenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Globalv globalv;
    String use1 , pass1 , email1 , phone1 , bir1 , count1 , Userch ,Passch;
    EditText Userin , Passin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        globalv = (Globalv)getApplicationContext();

        Userin = (EditText)findViewById(R.id.userin);
        Passin = (EditText)findViewById(R.id.passin);




        use1 = globalv.getUse1();
        pass1 = globalv.getPass1();
        email1 = globalv.getEmail1();
        phone1 = globalv.getPhone1();
        bir1 = globalv.getBir1();
        count1 = globalv.getCount1();
    }

    public void onClickin(View view) {
        Userch = Userin.getText().toString();
        Passch = Passin.getText().toString();

        if ( Userch.equals(use1)) {
            if (Passch.equals(pass1)) {


                Toast.makeText(getBaseContext(), " Your name is: " + use1 + " ", Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(), " Your email is: " + email1 + " ", Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(), " Your Phone Numer is: " + phone1 + " ", Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(), " Your birth date is: " + bir1 + " ", Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(), " Your Country is: " + count1 + " ", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getBaseContext(), " Username or password is incorrect ", Toast.LENGTH_SHORT).show();

            }


        }else {
            Toast.makeText(getBaseContext(), " Username or password is incorrect ", Toast.LENGTH_SHORT).show();

        }


    }

    public void onClickup(View view) {
        Intent intent= new Intent(getApplicationContext(),CreateMain.class);
        startActivity(intent);


    }
}
