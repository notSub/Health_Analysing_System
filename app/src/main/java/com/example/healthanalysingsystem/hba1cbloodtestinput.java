package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myimports.dictionarystore;

public class hba1cbloodtestinput extends AppCompatActivity {
    EditText hba1c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hba1cbloodtestinput);
        Button next =findViewById(R.id.button);
        next = (Button) findViewById(R.id.button1211);
        //
        hba1c=findViewById(R.id.editTextNumberDecimal15);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hba1cbloodtestinput = new Intent(getApplicationContext(),hba1cbloodtestoutput.class);
                //storing it in dictionary
                dictionarystore.setdicts("hba1c",hba1c.getText().toString());
                //start the next activity
                startActivity(hba1cbloodtestinput);
            }
        });
    }
}