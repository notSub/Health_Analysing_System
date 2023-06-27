package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myimports.dictionarystore;
import com.example.myimports.thyroidtest;
import com.example.myimports.thyroidtestsym;

public class thyroidfunctiontestsym extends AppCompatActivity {
    TextView triiodothyronine,thyroxine,tsh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thyroidfunctiontestsym);
        Button next =findViewById(R.id.button2);
        next = (Button) findViewById(R.id.button2);
        //
        triiodothyronine=findViewById(R.id.textView49);
        thyroxine=findViewById(R.id.textView70);
        tsh=findViewById(R.id.textView71);

        //
        String triiodothyronines = dictionarystore.getdicts("triiodothyronine");
        String thyroxines = dictionarystore.getdicts("thyroxine");
        String tshs = dictionarystore.getdicts("tsh");

        //
        String triiodothyroninel = thyroidtestsym.triiodothyronine(triiodothyronines);
        String thyroxinel = thyroidtestsym.thyroxine(thyroxines);
        String tshl = thyroidtestsym.tsh(tshs);
        triiodothyronine.setText(triiodothyroninel);
        thyroxine.setText(thyroxinel);
        tsh.setText(tshl);
        //
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thyroidfuctiontestsym = new Intent(getApplicationContext(),thyroidfunctiontestfood.class);
                startActivity(thyroidfuctiontestsym);
            }
        });
    }
}