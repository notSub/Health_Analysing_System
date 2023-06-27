package com.example.myimports;

import java.util.Dictionary;
import java.util.Hashtable;

public class dictionarystore {
    public static Dictionary d = new Hashtable();
    public static  void setdicts(String key,String answer) {
        d.put(key, answer);
    }
    public static  String getdicts(String key){
        return (String) d.get(key);
    }
}