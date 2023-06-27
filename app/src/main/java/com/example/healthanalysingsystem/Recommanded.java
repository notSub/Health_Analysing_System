package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myimports.bloodtestsym;
import com.example.myimports.dictionarystore;

public class Recommanded extends AppCompatActivity {
    TextView ed1, ed2, ed3,sed1,sed2,sed3;
    Button nextfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommanded);
        ed1 = findViewById(R.id.textView20);
        ed2 = findViewById(R.id.textView21);
        ed3 = findViewById(R.id.textView41);

        //sym
        sed1=findViewById(R.id.textView55);
        sed2=findViewById(R.id.textView56);
        sed3=findViewById(R.id.textView57);

        //next button
        nextfood = findViewById(R.id.button31);
        Button nextfood = (Button) findViewById(R.id.button31);


        //accessing dict
        String rbc= dictionarystore.getdicts("rbc");
        String wbc= dictionarystore.getdicts("wbc");
        String Haemoglobin = dictionarystore.getdicts("haemoglobin");
        //calling method
        String  sed1s= bloodtestsym.rbcsym(rbc);
        String  sed2s= bloodtestsym.wbcsym(wbc);
        String  sed3s= bloodtestsym.Haemoglobinsym(Haemoglobin);
        //setting values for sym
        sed1.setText(sed1s);
        sed2.setText(sed2s);
        sed3.setText(sed3s);

        //Button Action listner for food activity
        nextfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //creating indent for food activity
                Intent ins = new Intent(getApplicationContext(),food.class);
                //Stating the food activity
                startActivity(ins);

            }
        });
    }
}