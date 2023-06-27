package com.example.myimports;

public class cholestroltest {
    public static String TotalCholestrol(String a){
        if(Float.parseFloat(a)<=200){
            return "NORMAL";
        }

        else if(Float.parseFloat(a)>200){
            return "HIGH";
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
            return "LOW";
        }
        else if(Float.parseFloat(a)>150){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String HDLCholestrol(String a){
        if(Float.parseFloat(a)>=40&&Float.parseFloat(a)<=60){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<40){
            return "LOW";
        }
        else if(Float.parseFloat(a)>60){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String LDLCholestrol(String a){
        if(Float.parseFloat(a)>=70&&Float.parseFloat(a)<=130){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<70){
            return "LOW";
        }
        else if(Float.parseFloat(a)>130){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String VLDL(String a){
        if(Float.parseFloat(a)>=2&&Float.parseFloat(a)<=30){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<2){
            return "LOW";
        }
        else if(Float.parseFloat(a)>30){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
}
