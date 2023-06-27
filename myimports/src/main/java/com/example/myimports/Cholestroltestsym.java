package com.example.myimports;

public class Cholestroltestsym {
    public static String TotalCholestrol(String a){
        if(Float.parseFloat(a)>=10&&Float.parseFloat(a)<=150){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<10){
            return "Nervousness"+" ,Confusion";
        }
        else if(Float.parseFloat(a)>150){
            return "No Symptoms";
        }
        else{
            return "NULL";
        }
    }
    public static String Triglycerides(String a){
        if(Float.parseFloat(a)>=10&&Float.parseFloat(a)<=150){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<10){
            return "Feeling Cold"+" ,Dry Skin";
        }
        else if(Float.parseFloat(a)>150){
            return "Vomiting"+" ,Fever";
        }
        else{
            return "NULL";
        }
    }
}
