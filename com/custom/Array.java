package com.custom;

public class Array{

    //Get the largest element in the array.
    public static int getBig(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        return max;
    }

      //Get the smallest element in the array.
      public static int getSmall(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            min=Math.min(min,a[i]);
        }
        return min;
    }

    //get reverse of the array.
    public static int[] reverse(int[] a){
        int j=0;int temp=0;
        for(int i=a.length-1;i>=0 && j<=i;i--){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            ++j;
        }
        return a;
    }

    //checks if array is palindrome
    public static Boolean isPalindrome(int[] a){
        int j=0;
        if(a.length==1)
        return true;
        for(int i=a.length-1;i>=0 && j<=i;i--){
            if(a[i]!=a[j])
            return false;
            ++j;
        }
        return true;
    }




    //Sort method with a time-complexity of o(n^2)
    public static int[] bubbleSort(int[] a){
        int flag=0;int temp=0;
        while(flag!=1){
            flag=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                flag=0;
            }
        }
    }
    return a;
    }



}