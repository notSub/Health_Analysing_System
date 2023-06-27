package com.example.myimports;

public class bloodtestfood {
    public static String Haemoglobinfood(String a){
        if(Float.parseFloat(a)<13){
            return "EAT NUTS AND SEEDS" ;
        }
        else if(Float.parseFloat(a)>17){
            return "MEAT AND FISH";
        }
        else{
            return "NULL";
        }
    }
    public static String rbcfood(String a){
        if(Float.parseFloat(a)<4.5){
            return "TAKE DRY FOODS";
        }
        else if(Float.parseFloat(a)>5.5){
            return "ADD BEANS IN REGULAR FOOD";
        }
        else{
            return "NULL";
        }
    }
    public static String wbcfood(String a){
        if (Float.parseFloat(a)<4000){
            return "EAT ORANGE AND LEMON";
        }
        else if (Float.parseFloat(a)>10000){
            return "EAT ORANGE AND LEMON";
        }
        else{
            return "NULL";
        }
    }
}
