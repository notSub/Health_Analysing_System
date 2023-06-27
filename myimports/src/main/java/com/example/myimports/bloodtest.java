package com.example.myimports;

public class bloodtest {
    public static String WBC(String a){
        if (Float.parseFloat(a)>=4000 && Float.parseFloat(a)<=10000){
            return "NORMAL";
        }else if (Float.parseFloat(a)<4000){
            return "LOW";
        }
        else if (Float.parseFloat(a)>10000){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String CH(String a){
        if (Float.parseFloat(a)>=24 && Float.parseFloat(a)<=35){
            return "NORMAL";
        }else if (Float.parseFloat(a)<24){
            return "LOW";
        }
        else if (Float.parseFloat(a)>35){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }

    public static String Neutrophils(String a) {

        if (Float.parseFloat(a) >= 45 && Float.parseFloat(a) <= 75) {
            return "NORMAL";
        } else if (Float.parseFloat(a) < 45) {
            return "LOW";
        } else if (Float.parseFloat(a) > 75) {
            return "HIGH";
        } else {
            return "NULL";
        }
    }
    public static String Lymphocytes(String a){
        if(Float.parseFloat(a)>=25&&Float.parseFloat(a)<=40){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<25){
            return "LOW";
        }
        else if(Float.parseFloat(a)>40){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String Monocytes(String a) {
        if (Float.parseFloat(a) >= 2 && Float.parseFloat(a) <= 10) {
            return "NORMAL";
        } else if(Float.parseFloat(a) < 2) {
            return "LOW";
        } else if(Float.parseFloat(a) > 10) {
            return "HIGH";
        } else{
            return "NULL";
        }
    }
    public static String Eosinophls(String a){
        if(Float.parseFloat(a)>=1&&Float.parseFloat(a)<=6){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<1){
            return "LOW";
        }
        else if(Float.parseFloat(a)>6){
            return "HIGH";
        }
        else {
            return "NULL";
        }
    }
    public static String Basophils(String a){
        if(Float.parseFloat(a)>=0&&Float.parseFloat(a)<=2){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<0){
            return "LOW";
        }
        else if(Float.parseFloat(a)>2){
            return "HIGH";
        }
        else {
            return "NULL";
        }
    }
    public static String LUC(String a){
        if(Float.parseFloat(a)>=1&&Float.parseFloat(a)<=4){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<1){
            return "LOW";
        }
        else if(Float.parseFloat(a)>4){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String RBC(String a){
        if(Float.parseFloat(a)>=4.5&&Float.parseFloat(a)<=5.5){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<4.5){
            return "LOW";
        }
        else if(Float.parseFloat(a)>5.5){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String RBCmen(String a){
        if(Float.parseFloat(a)>=4.7&&Float.parseFloat(a)<=6.1){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<4.7){
            return "LOW";
        }
        else if(Float.parseFloat(a)>6.1){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String RBCwomen(String a){
        if(Float.parseFloat(a)>=4.2&&Float.parseFloat(a)<=5.4){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<4.2){
            return "LOW";
        }
        else if(Float.parseFloat(a)>5.4){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String Haemoglobin(String a){
        if(Float.parseFloat(a)>=13&&Float.parseFloat(a)<=17){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<13){
            return "LOW";
        }
        else if(Float.parseFloat(a)>17){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String Haemoglobinmen(String a){
        if(Float.parseFloat(a)>=14&&Float.parseFloat(a)<=17){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<14){
            return "LOW";
        }
        else if(Float.parseFloat(a)>17){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String Haemoglobinwomen(String a){
        if(Float.parseFloat(a)>=12&&Float.parseFloat(a)<=15){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<12){
            return "LOW";
        }
        else if(Float.parseFloat(a)>15){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String PCV(String a){
        if(Float.parseFloat(a)>=40&&Float.parseFloat(a)<=50){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<40){
            return "LOW";
        }
        else if(Float.parseFloat(a)>50){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String MCV(String a){
        if(Float.parseFloat(a)>=83&&Float.parseFloat(a)<=101){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<83){
            return "LOW";
        }
        else if(Float.parseFloat(a)>101){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String MCH(String a){
        if(Float.parseFloat(a)>=27&&Float.parseFloat(a)<=32){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<27){
            return "LOW";
        }
        else if(Float.parseFloat(a)>32){
            return "HIGH";
        }
        else{
            return "NULL";
        }
    }
    public static String MCHC(String a){
        if(Float.parseFloat(a)>=31.5&&Float.parseFloat(a)<=34.5){
            return "NORMAL";
        }
        else if(Float.parseFloat(a)<31){
            return "LOW";
        }
        else if(Float.parseFloat(a)>34){
            return "HIGH";
        }
        else {
            return "NULL";
        }
    }


}
