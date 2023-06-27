package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button bloodtestact =findViewById(R.id.button);
        bloodtestact= (Button) findViewById(R.id.button);
        //button objects
        Button livertestact = findViewById(R.id.button2);
        livertestact= (Button) findViewById(R.id.button2);
        Button cholesterol= (Button) findViewById(R.id.button3);
        Button thyroidtestact= (Button) findViewById(R.id.button4);
        Button cardiovasculartest= (Button) findViewById(R.id.button5);


        //listner for buttons
        bloodtestact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbloodtest= new Intent(getApplicationContext(),genterselection.class);
                startActivity(intentbloodtest);

            }
        });
        livertestact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View views) {
                Intent livertest = new Intent(getApplicationContext(),livertestinput.class);
                startActivity(livertest);

            }
        });
        cholesterol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View views) {
                Intent livertest = new Intent(getApplicationContext(),cholestroltestinput.class);
                startActivity(livertest);

            }
        });
        thyroidtestact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View views) {
                Intent thyroidtest = new Intent(getApplicationContext(),thyroidfunctiontestinput.class);
                startActivity(thyroidtest);

            }
        });
        cardiovasculartest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hba1cbloodtest = new Intent(getApplicationContext(), hba1cbloodtestinput.class);
                startActivity(hba1cbloodtest);
            }
        });

    }
}