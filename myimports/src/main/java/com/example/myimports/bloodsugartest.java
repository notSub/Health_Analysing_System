package com.example.myimports;

public class bloodsugartest {
    public static String Random(String a){
        if(Float.parseFloat(a)>=79&&Float.parseFloat(a)<=160){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<79){
            return "LOW";
        }
        else if(Float.parseFloat(a)>160){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String Fasting(String a){
        if(Float.parseFloat(a)>=90&&Float.parseFloat(a)<=110){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<90){
            return "LOW";
        }
        else if(Float.parseFloat(a)>110){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String HrPP(String a){
        if(Float.parseFloat(a)<=140){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)>140){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
}
