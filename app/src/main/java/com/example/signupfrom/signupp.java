package com.example.signupfrom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class signupp extends AppCompatActivity {
EditText editText1,editText2,editText3,editText4,editText5;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupp);
        editText1=(EditText)findViewById(R.id.fnam);
        editText2=(EditText)findViewById(R.id.lnam);
        editText3=(EditText)findViewById(R.id.email);
        editText4=(EditText)findViewById(R.id.pas);
        editText5=(EditText)findViewById(R.id.cpas);
        btn=(Button)findViewById(R.id.b1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ed=editText1.getText().toString();
                String ed1=editText2.getText().toString();
                String ed2=editText3.getText().toString();
                String ed3=editText4.getText().toString();
                String ed4=editText5.getText().toString();
               /* Intent in=new Intent(getApplicationContext(),acc.class);*/
                startActivity(new Intent(getApplicationContext(),acc.class));
            }
        });
    }
}