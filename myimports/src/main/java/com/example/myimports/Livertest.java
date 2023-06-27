package com.example.myimports;

public class Livertest {
    public static String alkalinephosphatase(String a){
        if(Float.parseFloat(a)>=30 && Float.parseFloat(a)<=115){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<30){
            return "LOW";
        }
        else if(Float.parseFloat(a)>115){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }

    //GGT(GLOBULIN)
    public static String ggt(String a){
        if(Float.parseFloat(a)>=2 && Float.parseFloat(a)<=3.5){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<2){
            return "LOW";
        }
        else if(Float.parseFloat(a)>3.5){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String ast(String a){
        if(Float.parseFloat(a)>=10 && Float.parseFloat(a)<=40){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<10){
            return "LOW";
        }
        else if(Float.parseFloat(a)>40){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String alt(String a){
        if(Float.parseFloat(a)>=10 && Float.parseFloat(a)<=40){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<10){
            return "LOW";
        }
        else if(Float.parseFloat(a)>40){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String bilirubin(String a){
        if(Float.parseFloat(a)>=0 && Float.parseFloat(a)<=30){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<0){
            return "LOW";
        }
        else if(Float.parseFloat(a)>30){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    //AMMONIA(albuMIN)
    public static String ammonia(String a){
        if(Float.parseFloat(a)>=3.5 && Float.parseFloat(a)<=5){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<3.5){
            return "LOW";
        }
        else if(Float.parseFloat(a)>5){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
}
