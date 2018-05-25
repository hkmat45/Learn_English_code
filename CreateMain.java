package com.muhammad.android.learnenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CreateMain extends AppCompatActivity {
    Globalv globalv;

    TextView txtv;
    String use1 , pass1 , email1 , phone1 , bir1 , count1;
    EditText Userup , Emailup , Passup , Phoneup , Birthyup ;
    Spinner Coutup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_main);

        globalv = (Globalv)getApplicationContext();

        Userup = (EditText)findViewById(R.id.userup);
        Emailup = (EditText)findViewById(R.id.emailup);
        Passup = (EditText)findViewById(R.id.passup);
        Phoneup = (EditText)findViewById(R.id.phoneup);
        Birthyup = (EditText)findViewById(R.id.birthyup);
        Coutup = (Spinner)findViewById(R.id.countryup);
        txtv = (TextView) findViewById(R.id.try12);

        final Spinner Subject_spinner = (Spinner)findViewById(R.id.countryup);

        final List<String> spinnerArry = new ArrayList<String>();
         spinnerArry.add("Egypt");
         spinnerArry.add("Algeria");
         spinnerArry.add("Sudan");
         spinnerArry.add("Morocco");
         spinnerArry.add("Saudi Arabia");
         spinnerArry.add("Yemen");
         spinnerArry.add("Syria");
         spinnerArry.add("Somalia");
         spinnerArry.add("Tunisia");
         spinnerArry.add("United Arab Emirates");
         spinnerArry.add("Jordan");
         spinnerArry.add("Libya");
         spinnerArry.add("Palestine");
         spinnerArry.add("Lebanon");
         spinnerArry.add("Oman");
         spinnerArry.add("Kuwait");
         spinnerArry.add("Mauritania");
         spinnerArry.add("Qatar");
         spinnerArry.add("Bahrain");
         spinnerArry.add("Djibouti");
         spinnerArry.add("Comoros");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArry);

         adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

         Subject_spinner.setAdapter(adapter);
         Subject_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 txtv.setText(spinnerArry.get(position));
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }


         });
        }

    public void onClick(View v) {



        globalv.setUse1(Userup.getText().toString());
        globalv.setPass1(Passup.getText().toString());
        globalv.setEmail1(Emailup.getText().toString());
        globalv.setPhone1(Phoneup.getText().toString());
        globalv.setBir1(Birthyup.getText().toString());
        globalv.setCount1(txtv.getText().toString());


        Toast.makeText(getBaseContext(), " Sign up id done! ", Toast.LENGTH_SHORT).show();

        Intent intent= new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);




    }




}
