package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myimports.Cholestroltestfood;
import com.example.myimports.cholestroltest;
import com.example.myimports.dictionarystore;

public class cholestroltestfood extends AppCompatActivity {
    TextView totalcholesterol,triglycerides,hdl,ldl,vldl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholestroltestfood);
        Button next =findViewById(R.id.button1211);
        next = (Button) findViewById(R.id.button1211);
        //
        totalcholesterol=findViewById(R.id.textView73);
        triglycerides=findViewById(R.id.textView74);
        //
        String totalcholesterols= dictionarystore.getdicts("totalcholesterol");
        String triglyceridess=dictionarystore.getdicts("triglycerides");
        //
        String totalcholesteroll= Cholestroltestfood.TotalCholestrol(totalcholesterols);
        String triglyceridesl=Cholestroltestfood.Triglycerides(triglyceridess);
        //
        totalcholesterol.setText(totalcholesteroll);
        triglycerides.setText(triglyceridesl);
        //
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cholestroltestsym = new Intent(getApplicationContext(),select.class);
                startActivity(cholestroltestsym);
            }
        });}
}