package com.example.myimports;

public class thyroidtestsym {
    public static String tsh(String a){
        if(Float.parseFloat(a)>=0.3 && Float.parseFloat(a)<=5.0){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<0.3){
            return "Weight loss,Sleep issues,Bulging eyes";
        }
        else if(Float.parseFloat(a)>5.0){
            return "Slow heart rate,Irregular or heavy menstrual periods";
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
            return "Slow Movements and thoughts,Muscle cramps";
        }
        else if(Float.parseFloat(a)>11.5){
            return "Cold or Clammy skin,fast or weak pulse";
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
            return "Weight gain,puffy face";
        }
        else if(Float.parseFloat(a)>200){
            return "Increased appetite,Nervousness,anxiety";
        }
        else{
            return "NULL";
        }
    }
}
