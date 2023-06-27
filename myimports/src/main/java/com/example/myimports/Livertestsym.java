package com.example.myimports;

public class Livertestsym {
    public static String alkalinephosphatase(String a) {
        if (Float.parseFloat(a) >= 30 && Float.parseFloat(a) <= 115) {
            return "NORMAL";
        }
        else if(Float.parseFloat(a) < 30) {
            return "SHORT STATURE" + ",BONE & JOINT PAIN";
        }else if (Float.parseFloat(a) > 115) {
            return "STOMACH PAIN" + ",WEIGHT LOSS";
        }else {
            return "NULL";
        }
    }


    public static String ast(String a) {
        if (Float.parseFloat(a) >= 10 && Float.parseFloat(a) <= 40) {
            return "NORMAL";
        }
        else if (Float.parseFloat(a) < 10) {
            return "Vitamin B6 deficiency";
        } else if (Float.parseFloat(a) > 40) {
            return "liver problems";
        } else {
            return "NULL";
        }
    }

    public static String alt(String a) {
        if (Float.parseFloat(a) >= 10 && Float.parseFloat(a) <= 40) {
            return "NORMAL";
        }
        else if (Float.parseFloat(a) < 10) {
            return "Vitamin B6 deficiency" + ", Chronic Kidney disease";
        }else if (Float.parseFloat(a) > 40) {
            return "Alcohol-induced liver injury" + ",Fatty Liver Disease";
        }else {
            return "NULL";
        }
    }

    public static String bilirubin(String a) {
        if (Float.parseFloat(a) >= 0 && Float.parseFloat(a) <= 30) {
            return "NORMAL";
        } else if (Float.parseFloat(a) > 30) {
            return "Lightheadedness" + ",Fatigue";
        } else {
            return "no symptoms";
        }
    }
    //GGT(GLOBULIN)
    public static String ggt(String a){
        if(Float.parseFloat(a)>=2 && Float.parseFloat(a)<=3.5){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<2){
            return "Liver,kidney problems";
        }
        else if(Float.parseFloat(a)>3.5){
            return "Night sweats,\nWeight loss,\nBreathlessness";
        }
        else{
            return "NULL";
        }
    }
    //AMMONIA(albuMIN)
    public static String ammonia(String a){
        if(Float.parseFloat(a)>=3.5 && Float.parseFloat(a)<=5){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<3.5){
            return "Weak muscle tone"+" Jaundice";
        }
        else if(Float.parseFloat(a)>5){
            return "Dehydration"+" Severe diarrhea";
        }
        else{
            return "NULL";
        }
    }
}