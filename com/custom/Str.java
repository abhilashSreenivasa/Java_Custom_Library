package com.custom;
import java.util.regex.Pattern;

public class Str {

    // Converts first letter of the String to uppercase.
    public static String capitalize(String s){
        String[] str=s.split("");
        return str[0].toUpperCase()+s.substring(1,s.length());
    }

    // counts the occurences of String s2 in String S1. 
    public static int count(String s1,String s2){
        int count=0;
        String[] str=s1.split(" ");
        for(String match:str){
            if(match.contains(s2))
            ++count;
        }
        return count;
    }

    // Checks if String s1 ends with String s2.
    public static Boolean endsWith(String s1,String s2){
        String temp="";
        if(s1.length()<s2.length() || s2.length()==0)
        return false;
        String[] str=s1.split("");
        for(int i=str.length-s2.length();i<str.length;i++){
            temp+=str[i];
        }
        if(temp.equals(s2))
        return true;
        return false;
    }

    // Finds String s2's  position in String s1.
    public static int find(String s1,String s2){
        int count=0;
        String[] str=s1.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].contains(s2))
            return count;
            count+=str[i].length()+1;
        }
        return -1;
    }

    // Returns true if all characters in the string are alphabets.
    public static Boolean isAlpha(String s){
        Pattern p = Pattern.compile("^[a-zA-Z]*$");
        return p.matcher(s).find();
    }

     // Returns true if all characters in the string are Digits.
     public static Boolean isDigit(String s){
        Pattern p = Pattern.compile("^[0-9]*$");
        return p.matcher(s).find();
    }
    
     // Returns true if given String is a valid identifier.
     public static Boolean isIdentifier(String s){
        Pattern p = Pattern.compile("^([a-zA-Z_$][a-zA-Z\\d_$]*)$");
        return p.matcher(s).find();
    }

    




}