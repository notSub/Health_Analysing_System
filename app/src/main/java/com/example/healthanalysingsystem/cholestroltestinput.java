package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myimports.dictionarystore;

public class cholestroltestinput extends AppCompatActivity {
    EditText totalcholesterol,triglycerides,hdl,ldl,vldl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholestroltestinput);
        Button next =findViewById(R.id.button1211);
        next = (Button) findViewById(R.id.button1211);
        totalcholesterol=findViewById(R.id.editTextNumberDecimal7);
        triglycerides=findViewById(R.id.editTextNumberDecimal16);
        hdl=findViewById(R.id.editTextNumberDecimal17);
        ldl=findViewById(R.id.editTextNumberDecimal18);
        vldl=findViewById(R.id.editTextNumberDecimal19);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cholestrolinput = new Intent(getApplicationContext(),cholestroltestoutput.class);
                //storing it in dictionary
                dictionarystore.setdicts("totalcholesterol",totalcholesterol.getText().toString());
                dictionarystore.setdicts("triglycerides",triglycerides.getText().toString());
                dictionarystore.setdicts("hdl",hdl.getText().toString());
                dictionarystore.setdicts("ldl",ldl.getText().toString());
                dictionarystore.setdicts("vldl",vldl.getText().toString());
                //start the next activity
                startActivity(cholestrolinput);
                }
            });
        }

}
