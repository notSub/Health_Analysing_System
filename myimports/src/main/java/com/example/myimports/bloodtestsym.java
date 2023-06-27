package com.example.myimports;

public class bloodtestsym {
    public static String Haemoglobinsym(String a){
        if(Float.parseFloat(a)<13){
            return "FATIGUE"+",  IRREGULAR HEARTBEAT";
        }
        else if(Float.parseFloat(a)>17){
            return "JOINT SWELLING" + ",  JAUNDICE";
        }
        else{
            return "NULL";
        }
    }
    public static String rbcsym(String a){
        if(Float.parseFloat(a)<4.5){
            return "DIZZIENESS" + " ,PALE SKIN";
        }
        else if(Float.parseFloat(a)>5.5){
            return "SLEEP DISTURBANCE" + ",ITCHING SKIN";
        }
        else{
            return "NULL";
        }
    }
    public static String wbcsym(String a){
        if (Float.parseFloat(a)<4000){
            return "MOUTH SORES" + ",SINUS INFECTION";
        }
        else if (Float.parseFloat(a)>10000){
            return "BODY ACHE" + ",DUE TO INFECTION";
        }
        else{
            return "NULL";
        }
    }
}
