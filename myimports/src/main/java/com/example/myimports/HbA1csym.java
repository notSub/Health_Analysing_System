package com.example.myimports;

public class HbA1csym {
    public static String HbA1c(String a){
        if(Float.parseFloat(a)>=0&&Float.parseFloat(a)<=5.6){
            return "Normal";
        }
        else if(Float.parseFloat(a)>5.6&&Float.parseFloat(a)<=6.5){
            return "Pre-Diabetes";
        }
        else if(Float.parseFloat(a)>6.5){
            return "Diabetes";
        }
        else{
            return "NULL";
        }
    }
}
