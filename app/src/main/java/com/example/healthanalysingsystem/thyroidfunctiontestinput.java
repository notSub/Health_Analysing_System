package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myimports.dictionarystore;

public class thyroidfunctiontestinput extends AppCompatActivity {
    EditText triiodothyronine,thyroxine,tsh;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thyroidfunctiontestinput);
        Button next =findViewById(R.id.button1211);
        next = (Button) findViewById(R.id.button1211);
        triiodothyronine=findViewById(R.id.editTextNumberDecimal7);
        thyroxine=findViewById(R.id.editTextNumberDecimal16);
        tsh=findViewById(R.id.editTextNumberDecimal17);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thyroidtestinput = new Intent(getApplicationContext(),thyroidfunctiontestoutput.class);
                //storing it in dictionary
                dictionarystore.setdicts("triiodothyronine",triiodothyronine.getText().toString());
                dictionarystore.setdicts("thyroxine",thyroxine.getText().toString());
                dictionarystore.setdicts("tsh",tsh.getText().toString());
                //start the next activity
                startActivity(thyroidtestinput);
            }
        });

    }
}