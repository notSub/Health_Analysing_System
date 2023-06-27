package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myimports.HbA1cfood;
import com.example.myimports.HbA1csym;
import com.example.myimports.dictionarystore;

public class hba1cbloodtestfood extends AppCompatActivity {
    TextView hba1c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hba1cbloodtestfood);
        Button next =findViewById(R.id.button);
        next = (Button) findViewById(R.id.button1211);
        //
        hba1c=findViewById(R.id.textView72);
        //accessing dictionary
        String hba1cs = dictionarystore.getdicts("hba1c");
        //accessing modules
        String hba1cl = HbA1cfood.HbA1c(hba1cs);
        //setting values
        hba1c.setText(hba1cl);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hba1cbloodtestfood = new Intent(getApplicationContext(),select.class);
                //start the next activity
                startActivity(hba1cbloodtestfood);
            }
        });
    }
}