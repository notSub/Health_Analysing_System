package com.example.myimports;

public class HbA1ctest {
    public static String HbA1c(String a){
        if(Float.parseFloat(a)>=4.5&&Float.parseFloat(a)<=6.4){
            return "Excellent";
        }
        else if(Float.parseFloat(a)>=6.5&&Float.parseFloat(a)<=7.0){
            return "Good";
        }
        else if(Float.parseFloat(a)>=7.1&&Float.parseFloat(a)<=8.0){
            return "Acceptable";
        }
        else if(Float.parseFloat(a)>8.0){
            return "Poor";
        }
        else{
            return "NULL";
        }
    }
}
