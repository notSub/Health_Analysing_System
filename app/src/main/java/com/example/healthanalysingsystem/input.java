package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.myimports.bloodtest;
import com.example.myimports.dictionarystore;
public class input extends AppCompatActivity {

    EditText rbc ,wbc ,haemoglobin ,lymphocytes ,monocytes ,eosiniphils ,basophils ,neutrophils ,luc ,pcv ,mcv ,mch ,mchc ,ch ;
    Button inputnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_input);
        //creating edittext R-id
        rbc =findViewById(R.id.editTextNumberDecimal7);
        wbc =findViewById(R.id.editTextNumberDecimal8);
        haemoglobin =findViewById(R.id.editTextNumberDecimal);
        lymphocytes =findViewById(R.id.editTextNumberDecimal9);
        monocytes =findViewById(R.id.editTextNumberDecimal3);
        eosiniphils =findViewById(R.id.editTextNumberDecimal4);
        basophils =findViewById(R.id.editTextNumberDecimal5);
        neutrophils =findViewById(R.id.editTextNumberDecimal6);
        luc =findViewById(R.id.editTextNumberDecimal2);
        pcv =findViewById(R.id.editTextNumberDecimal10);
        mcv =findViewById(R.id.editTextNumberDecimal11);
        mch =findViewById(R.id.editTextNumberDecimal12);
        mchc =findViewById(R.id.editTextNumberDecimal13);
        ch =findViewById(R.id.editTextNumberDecimal14);
        //button R-id
        inputnext =findViewById(R.id.button2);
        Button inputnext = (Button) findViewById(R.id.button2);

        //action listener
        inputnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),outpupt.class);
                //storing it in dictionary
                dictionarystore.setdicts("rbc",rbc.getText().toString());
                dictionarystore.setdicts("wbc",wbc.getText().toString());
                dictionarystore.setdicts("haemoglobin",haemoglobin.getText().toString());
                dictionarystore.setdicts("lymphocytes",lymphocytes.getText().toString());
                dictionarystore.setdicts("monocytes",monocytes.getText().toString());
                dictionarystore.setdicts("eosiniphils",eosiniphils.getText().toString());
                dictionarystore.setdicts("basophils",basophils.getText().toString());
                dictionarystore.setdicts("neutrophils",neutrophils.getText().toString());
                dictionarystore.setdicts("luc",luc.getText().toString());
                dictionarystore.setdicts("pcv",pcv.getText().toString());
                dictionarystore.setdicts("mcv",mcv.getText().toString());
                dictionarystore.setdicts("mch",mch.getText().toString());
                dictionarystore.setdicts("mchc",mchc.getText().toString());
                dictionarystore.setdicts("ch",ch.getText().toString());

                //start the next activity
                startActivity(i);

            }
        });
    }
}

