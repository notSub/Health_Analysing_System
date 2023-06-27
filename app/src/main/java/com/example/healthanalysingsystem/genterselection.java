package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myimports.dictionarystore;

public class genterselection extends AppCompatActivity {
    Button next;
    RadioButton male, female;
    Button genders;
    RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genterselection);
        gender=(RadioGroup) findViewById(R.id.radioGroup);
    }


    public void checkMe(View view) {
        int selectedid =gender.getCheckedRadioButtonId();
        genders=(RadioButton)findViewById(selectedid);
        if(selectedid==-1){
            Toast.makeText(getApplicationContext(),"select Gender",Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getApplicationContext(),genders.getText(),Toast.LENGTH_SHORT).show();
            dictionarystore.setdicts("gender",genders.getText().toString());
            //creating indent for Recommanded activity
            Intent in = new Intent(getApplicationContext(),input.class);
            //start the next activity
            startActivity(in);


        }
    }
}