package com.custom;

import java.util.ArrayList;
import java.util.List;
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

    //Splits the string at line breaks and returns a list
    public static List<String> splitLines(String s){
        String[] str=s.split("\n");
        List<String> list=new ArrayList<String>();
        for(int i=0;i<str.length;i++)
        list.add(str[i]);
        return list; 
    }
    
    
    // Repeats the string in a new line on given count
    public static String repeat(String s,int count){
        String str="";
        for(int i=0;i<count;i++)
        str+=s+"\n";
        return str;
    }
    
    
    //Changes upper Character to lower and vice versa.
    public static String changeCase(String s){
        String changed="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                if(Character.isLowerCase(s.charAt(i)))
                changed+=String.valueOf(Character.toUpperCase(s.charAt(i)));
                else
                changed+=String.valueOf(Character.toLowerCase(s.charAt(i)));
            }
            else
            changed+=String.valueOf(s.charAt(i));

        }
        return changed;
    }


    //Find middle of the String
    public static Character middileChar(String s){
        if(s.length()>2){
        int mid=s.length()/2;
        return s.charAt(mid);
        }
        else
        return s.charAt(0);
        
    }






}