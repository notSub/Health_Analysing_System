package com.example.myimports;

public class Livertestfood {
    public static String alkalinephosphatase(String a) {
        if (Float.parseFloat(a) >= 30 && Float.parseFloat(a) <= 115) {
            return "NORMAL";
        }
        else if(Float.parseFloat(a) < 30) {
            return "Fish"+",Cereals" + ",Grains";
        }else if (Float.parseFloat(a) > 115) {
            return "Coffee"+"Legumes"+"Beets";
        }else {
            return "NULL";
        }
    }


    public static String ast(String a) {
        if (Float.parseFloat(a) >= 10 && Float.parseFloat(a) <= 40) {
            return "NORMAL";
        }
        else if (Float.parseFloat(a) < 10) {
            return "Oats"+",Banana"+",pork";
        } else if (Float.parseFloat(a) > 40) {
            return "Lemons"+",Oranges";
        } else {
            return "NULL";
        }
    }

    public static String alt(String a) {
        if (Float.parseFloat(a) >= 10 && Float.parseFloat(a) <= 40) {
            return "NORMAL";
        }
        else if (Float.parseFloat(a) < 10) {
            return "Oats"+",Banana"+",Fish";
        }else if (Float.parseFloat(a) > 40) {
            return "Peas"+",Broccoli";
        }else {
            return "NULL";
        }
    }

    public static String bilirubin(String a) {
        if (Float.parseFloat(a) >= 0 && Float.parseFloat(a) <= 30) {
            return "NORMAL";
        } else if (Float.parseFloat(a) > 30) {
            return "vitamin D" + ",Nuts"+",Olive oil";
        } else {
            return "Fruits"+",Vegetables"+",Fibre intake";
        }
    }
    //GGT(GLOBULIN)
    public static String ggt(String a){
        if(Float.parseFloat(a)>=2 && Float.parseFloat(a)<=3.5){
            return "NORMAL" ;
        }
        else if(Float.parseFloat(a)<2){
            return "Apple"+",Citrus Fruits"+",,Broccoli";
        }
        else if(Float.parseFloat(a)>3.5){
            return "Soy,Whole grains,Seafood";
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
            return "Dairy(roducts nuts)";
        }
        else if(Float.parseFloat(a)>5){
            return "Low protein foods";
        }
        else{
            return "NULL";
        }
    }
}
