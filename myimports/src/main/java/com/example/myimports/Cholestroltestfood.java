package com.example.myimports;

public class Cholestroltestfood {
    public static String TotalCholestrol(String a){
        if(Float.parseFloat(a)<10){
            return "Ghee"+" ,Coconut Oil";
        }
        else if(Float.parseFloat(a)>150){
            return "Legumes"+" ,Nuts";
        }
        else{
            return "NULL";
        }
    }
    public static String Triglycerides(String a){

        if(Float.parseFloat(a)<10){
            return "Honey"+" ,Cereal";
        }
        else if(Float.parseFloat(a)>150){
            return "Oily Fish"+" ,Citrus fruits"+" 'Fat-Free dairy product";
        }
        else{
            return "NULL";
        }
    }
}
