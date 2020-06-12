package com.custom;

// Class is made final in order to stop user of the class to extend another class from this class.
public final class Array{
    private Array(){
        //Constructor is made private in order to stop user from creating an object from this class.
    }

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

    //Searches a given number in an array and returns position.Return -1 if not found
    //O(n) time complexity

    public static int linearSearch(int[] a, int ele){
        for(int i=0;i<a.length;i++){
            if(a[i]==ele)
            return i;
        }
        return -1;
    }

   // Searches a given number in an array and returns position.Return -1 if not found
   //log(n) time complexity
   //Note: For Binary Search array should be sorted first

    public static int binarySearch(int[] a,int ele){
        if(a.length==0)
        return -1;
        Array.bubbleSort(a);
        int high=a.length-1;
        int low=0;
        int mid=0;
        while(low<high){
            mid=low+(high-low)/2; // Avoiding overflow of int.

            if(a[mid]==ele)
            return mid;

            if(a[mid]<ele)
            low=mid+1;

            if(a[mid]>ele)
            high=mid-1;

        }
        return -1;
        
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

    public static int[] selectionSort(int[] a){
        int j=0, min=a[0], temp=0;
        if(a.length<=1)
        return a;

        for(int i=0;i<a.length-1;i++){
            min=i;
            j=i+1;
            while(j!=a.length){
                if(a[min]>a[j])
                min=j;
                ++j;
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;

        }
        return a;
    }



}