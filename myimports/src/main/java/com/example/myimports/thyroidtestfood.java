package com.example.myimports;

public class thyroidtestfood {
    public static String tsh(String a){
        if(Float.parseFloat(a)>=0.3 && Float.parseFloat(a)<=5.0){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<0.3){
            return "Apple,Plum";
        }
        else if(Float.parseFloat(a)>5.0){
            return "Spinach,Nuts";
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
            return "Avocado,Nuts,Seeds";
        }
        else if(Float.parseFloat(a)>11.5){
            return "Citrus Fruits,Dairy products";
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
            return "Salted nuts,Dairy foods";
        }
        else if(Float.parseFloat(a)>200){
            return "Citrus Fruits,Dairy products";
        }
        else{
            return "NULL";
        }
    }
}
