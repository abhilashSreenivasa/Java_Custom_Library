package com.custom;

public class Str {

    public static String capitalize(String s){
        String[] str=s.split("");
        return str[0].toUpperCase()+s.substring(1,s.length());
     
    }

    public static int count(String s1,String s2){
        int count=0;
        String[] str=s1.split(" ");
        for(String match:str){
            if(match.contains(s2))
            ++count;
        }
        return count;

    }

  

  
}