package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myimports.Livertest;
import com.example.myimports.dictionarystore;

public class livertestoutput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livertestoutput);

        TextView alkalinephosphataset, ggtt, astt, altt , bilirubint, ammoniat;
        Button next;
        //text view r.id
        alkalinephosphataset =findViewById(R.id.textView59);
        ggtt =findViewById(R.id.textView58);
        astt =findViewById(R.id.textView49);
        altt =findViewById(R.id.textView60);
        bilirubint =findViewById(R.id.textView64);
        ammoniat =findViewById(R.id.textView65);
        //button r.id
        next =findViewById(R.id.button2);
        //accessing the dictionary
        String  alkalinephosphatase = dictionarystore.getdicts("alkalinephosphatase");
        String ggt =dictionarystore.getdicts("ggt");
        String ast =dictionarystore.getdicts("ast");
        String alt=dictionarystore.getdicts("alt");
        String bilirubin =dictionarystore.getdicts("bilirubin");
        String ammonia =dictionarystore.getdicts("ammonia");
        //calling the method
        String  alkalinephosphatasel = Livertest.alkalinephosphatase(alkalinephosphatase);
        String ggtl = Livertest.ggt(ggt);
        String astl = Livertest.ast(ast);
        String altl=  Livertest.alt(alt);
        String bilirubinl = Livertest.bilirubin(bilirubin);
        String ammonial = Livertest.ammonia(ammonia);

        //insert the values into the text view
        alkalinephosphataset.setText(alkalinephosphatasel);
        ggtt.setText(ggtl);
        astt.setText(astl);
        altt.setText(altl);
        bilirubint.setText(bilirubinl);
        ammoniat.setText(ammonial);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Livertestoutput = new Intent(getApplicationContext(),livertestsym.class);
                startActivity(Livertestoutput);
            }
        });
    }
}