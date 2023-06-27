package com.example.myimports;

public class HbA1cfood {
    public static String HbA1c(String a){
        if(Float.parseFloat(a)>=0&&Float.parseFloat(a)<=5.6){
            return "Normal";
        }
        else if(Float.parseFloat(a)>5.6&&Float.parseFloat(a)<=6.5){
            return "Beans,Legumes,Whole grains";
        }
        else if(Float.parseFloat(a)>6.5){
            return "Seeds,Natural fats,Leafy greens";
        }
        else{
            return "NULL";
        }
    }
}
