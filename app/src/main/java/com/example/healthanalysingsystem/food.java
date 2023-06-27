package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myimports.bloodtestfood;
import com.example.myimports.dictionarystore;

public class food extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    Button finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        //textview r-id
        tv1 = findViewById(R.id.textViewf1);
        tv2 = findViewById(R.id.textViewf2);
        tv3 = findViewById(R.id.textViewf3);
        //button r-id
        finish= findViewById(R.id.button41);
        Button finish = (Button) findViewById(R.id.button41);


        //accessing dict
        String rbc= dictionarystore.getdicts("rbc");
        String wbc= dictionarystore.getdicts("wbc");
        String Haemoglobin = dictionarystore.getdicts("haemoglobin");
        //calling the method
        String  sed1s= bloodtestfood.rbcfood(rbc);
        String  sed2s= bloodtestfood.wbcfood(wbc);
        String  sed3s= bloodtestfood.Haemoglobinfood(Haemoglobin);
        //setting the values
        tv1.setText(sed1s);
        tv2.setText(sed2s);
        tv3.setText(sed3s);
        //action listner
       finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //going back to input activity
                Intent inss = new Intent(getApplicationContext(),select.class);
                startActivity(inss);
            }
        });
    }

}