package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myimports.Livertest;
import com.example.myimports.bloodtest;
import com.example.myimports.dictionarystore;

public class livertestinput extends AppCompatActivity {
    EditText alkalinephosphatase, ggt, ast, alt, bilirubin, ammonia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livertestinput);


        //creating edittext R-id
        alkalinephosphatase = findViewById(R.id.editTextNumberDecimal7);
        ggt = findViewById(R.id.editTextNumberDecimal16);
        ast = findViewById(R.id.editTextNumberDecimal17);
        alt = findViewById(R.id.editTextNumberDecimal18);
        bilirubin = findViewById(R.id.editTextNumberDecimal19);
        ammonia = findViewById(R.id.editTextNumberDecimal20);
        //button R-id
        Button nexts = findViewById(R.id.button1211);
        nexts = (Button) findViewById(R.id.button1211);

        nexts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View views) {
                Intent livertestoutput = new Intent(getApplicationContext(),livertestoutput.class);

                //storing in dictionary
                dictionarystore.setdicts("alkalinephosphatase",alkalinephosphatase.getText().toString());
                dictionarystore.setdicts("ggt",ggt.getText().toString());
                dictionarystore.setdicts("ast",ast.getText().toString());
                dictionarystore.setdicts("alt",alt.getText().toString());
                dictionarystore.setdicts("bilirubin",bilirubin.getText().toString());
                dictionarystore.setdicts("ammonia",ammonia.getText().toString());
                //start the next activity
                startActivity(livertestoutput);
            }
        });
    }
}