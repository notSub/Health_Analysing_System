package com.example.healthanalysingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myimports.bloodtest;
import com.example.myimports.bloodtestsym;
import com.example.myimports.dictionarystore;
public class outpupt extends AppCompatActivity {
    TextView rbct, wbct, haemoglobint, lymphocytest, monocytest, eosiniphilst, basophilst, neutrophilst, luct, pcvt, mcvt, mcht, mchct, cht;
    Button nextent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outpupt);
        rbct = findViewById(R.id.textView22);
        wbct = findViewById(R.id.textView23);
        haemoglobint = findViewById(R.id.textView24);
        lymphocytest = findViewById(R.id.textView28);
        monocytest = findViewById(R.id.textView34);
        eosiniphilst = findViewById(R.id.textView38);
        basophilst = findViewById(R.id.textView39);
        neutrophilst = findViewById(R.id.textView40);
        luct = findViewById(R.id.textView42);
        pcvt = findViewById(R.id.textView43);
        mcvt = findViewById(R.id.textView44);
        mcht = findViewById(R.id.textView45);
        mchct = findViewById(R.id.textView46);
        cht = findViewById(R.id.textView47);


        //Next Button
        nextent = findViewById(R.id.buttonent);

        //
        String rbcs = dictionarystore.getdicts("rbc");
        String wbcs = dictionarystore.getdicts("wbc");
        String haemoglobins = dictionarystore.getdicts("haemoglobin");
        String lymphocytess = dictionarystore.getdicts("lymphocytes");
        String monocytess = dictionarystore.getdicts("monocytes");
        String eosiniphilss = dictionarystore.getdicts("eosiniphils");
        String basophilss = dictionarystore.getdicts("basophils");
        String neutrophilss = dictionarystore.getdicts("neutrophils");
        String lucs = dictionarystore.getdicts("luc");
        String pcvs = dictionarystore.getdicts("pcv");
        String mcvs = dictionarystore.getdicts("mcv");
        String mchs = dictionarystore.getdicts("mch");
        String mchcs = dictionarystore.getdicts("mchc");
        String chs = dictionarystore.getdicts("ch");
        //gender difference
        String gender = dictionarystore.getdicts("gender");

        if(gender.equals("MALE")){
            String  haemoglobinl =bloodtest.Haemoglobinmen(haemoglobins);
            String  rbcl = bloodtest.RBCwomen(rbcs);
            rbct.setText(rbcl);
            haemoglobint.setText(haemoglobinl);

        }
        else {
            String  haemoglobinl =bloodtest.Haemoglobinwomen(haemoglobins);
            String  rbcl = bloodtest.RBCwomen(rbcs);
            rbct.setText(rbcl);
            haemoglobint.setText(haemoglobinl);

        }
        //calling the methods

        String  wbcl =bloodtest.WBC(wbcs);
        String  lymphocytesl =bloodtest.Lymphocytes(lymphocytess);
        String  monocytesl =bloodtest.Monocytes(monocytess);
        String  eosiniphilsl =bloodtest.Eosinophls(eosiniphilss);
        String  basophilsl =bloodtest.Basophils(basophilss);
        String  neutrophilsl =bloodtest.Neutrophils(neutrophilss);
        String  lucl =bloodtest.LUC(lucs);
        String  pcvl =bloodtest.PCV(pcvs);
        String  mcvl =bloodtest.MCV(mcvs);
        String  mchl =bloodtest.MCH(mchs);
        String  mchcl=bloodtest.MCHC(mchcs);
        String  chl =bloodtest.CH(chs);
        //setting the textview

        wbct.setText(wbcl);
        lymphocytest.setText(lymphocytesl);
        monocytest.setText(monocytesl);
        eosiniphilst.setText(eosiniphilsl);
        basophilst.setText(basophilsl);
        neutrophilst.setText(neutrophilsl);
        luct.setText(lucl);
        pcvt.setText(pcvl);
        mcvt.setText(mcvl);
        mcht.setText(mchl);
        mchct.setText(mchcl);
        cht.setText(chl);
        //action listener for button
        nextent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating indent for Recommanded activity
                Intent in = new Intent(getApplicationContext(),Recommanded.class);
                //start the next activity
                startActivity(in);

            }
        });


    }
}
