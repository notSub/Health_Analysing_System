package com.example.myimports;

public class thyroidtest {
    public static String tsh(String a){
        if(Float.parseFloat(a)>=0.3 && Float.parseFloat(a)<=5.0){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<0.3){
            return "LOW";
        }
        else if(Float.parseFloat(a)>5.0){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String thyroxine(String a){
        if(Float.parseFloat(a)>=4.5 && Float.parseFloat(a)<=11.5){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<4.5){
            return "LOW";
        }
        else if(Float.parseFloat(a)>11.5){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String triiodothyronine(String a){
        if(Float.parseFloat(a)>=75&& Float.parseFloat(a)<=200){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<75){
            return "LOW";
        }
        else if(Float.parseFloat(a)>200){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
}
