package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myimports.cholestroltest;
import com.example.myimports.dictionarystore;

public class cholestroltestoutput extends AppCompatActivity {
    TextView totalcholesterol,triglycerides,hdl,ldl,vldl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholestroltestoutput);
        Button next =findViewById(R.id.button2);
        next = (Button) findViewById(R.id.button2);
        //
        totalcholesterol=findViewById(R.id.textView59);
        triglycerides=findViewById(R.id.textView58);
        hdl=findViewById(R.id.textView49);
        ldl=findViewById(R.id.textView60);
        vldl=findViewById(R.id.textView64);
        //
        String totalcholesterols=dictionarystore.getdicts("totalcholesterol");
        String triglyceridess=dictionarystore.getdicts("triglycerides");
        String hdls=dictionarystore.getdicts("hdl");
        String ldls=dictionarystore.getdicts("ldl");
        String vldls=dictionarystore.getdicts("vldl");
        //
        String totalcholesteroll= cholestroltest.TotalCholestrol(totalcholesterols);
        String triglyceridesl=cholestroltest.Triglycerides(triglyceridess);
        String hdll=cholestroltest.HDLCholestrol(hdls);
        String ldll=cholestroltest.LDLCholestrol(ldls);
        String vldll=cholestroltest.VLDL(vldls);

        //
        totalcholesterol.setText(totalcholesteroll);
        triglycerides.setText(triglyceridesl);
        hdl.setText(hdll);
        ldl.setText(ldll);
        vldl.setText(vldll);
        //
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cholestroltestoutput = new Intent(getApplicationContext(),cholestroltestsym.class);
                startActivity(cholestroltestoutput);
            }
        });
    }
}