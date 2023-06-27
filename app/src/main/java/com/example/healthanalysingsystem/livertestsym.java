package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myimports.Livertest;
import com.example.myimports.Livertestsym;
import com.example.myimports.dictionarystore;

public class livertestsym extends AppCompatActivity {
    TextView alkalinephosphataset, ggtt, astt, altt , bilirubint, ammoniat;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livertestsym);
        alkalinephosphataset = findViewById(R.id.textView58);
        ggtt = findViewById(R.id.textView50);
        astt = findViewById(R.id.textView66);
        altt = findViewById(R.id.textView67);
        bilirubint = findViewById(R.id.textView68);
        ammoniat = findViewById(R.id.textView69);
        //NEXT BUTTON
        next= findViewById(R.id.button2);
        Button next = (Button) findViewById(R.id.button2);

        //accessing the dictionary
        String alkalinephosphatase = dictionarystore.getdicts("alkalinephosphatase");
        String ggt =dictionarystore.getdicts("ggt");
        String ast =dictionarystore.getdicts("ast");
        String alt=dictionarystore.getdicts("alt");
        String bilirubin =dictionarystore.getdicts("bilirubin");
        String ammonia =dictionarystore.getdicts("ammonia");
        //CALLING THE METHOD
        String  alkalinephosphatases = Livertestsym.alkalinephosphatase(alkalinephosphatase);
        String ggts = Livertestsym.ggt(ggt);
        String asts = Livertestsym.ast(ast);
        String alts=  Livertestsym.alt(alt);
        String bilirubins = Livertestsym.bilirubin(bilirubin);
        String ammonias = Livertestsym.ammonia(ammonia);
        //SETTING THE VALUES FOR SYM
        alkalinephosphataset.setText(alkalinephosphatases);
        ggtt.setText(ggts);
        astt.setText(asts);
        altt.setText(alts);
        bilirubint.setText(bilirubins);
        ammoniat.setText(ammonias);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent livertestsym = new Intent(getApplicationContext(),livertestfood.class);
                startActivity(livertestsym);
            }
        });
    }
}