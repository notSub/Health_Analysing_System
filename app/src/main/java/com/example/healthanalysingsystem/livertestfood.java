package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myimports.Livertestfood;
import com.example.myimports.Livertestsym;
import com.example.myimports.dictionarystore;

public class livertestfood extends AppCompatActivity {
    TextView alkalinephosphataset, ggtt, astt, altt , bilirubint, ammoniat;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livertestfood);

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
        String  alkalinephosphatases = Livertestfood.alkalinephosphatase(alkalinephosphatase);
        String ggts = Livertestfood.ggt(ggt);
        String asts = Livertestfood.ast(ast);
        String alts=  Livertestfood.alt(alt);
        String bilirubins = Livertestfood.bilirubin(bilirubin);
        String ammonias = Livertestfood.ammonia(ammonia);
        //SETTING THE VALUES FOR SYM
        alkalinephosphataset.setText(alkalinephosphatases);
        ggtt.setText(ggts);
        astt.setText(asts);
        altt.setText(alts);
        bilirubint.setText(bilirubins);
        ammoniat.setText(ammonias);
        //
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent livertestfood = new Intent(getApplicationContext(),select.class);
                startActivity(livertestfood);
            }
        });
    }
}