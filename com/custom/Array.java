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
 
    //Selection Sort: TIme complexity:o(n^2)
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

    //checks if two arrays are equal.
    public static Boolean isEqual(int[] a,int[] b){
       if(a.length!=b.length)
       return false;
      if(b.length!=0){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
            return false;
        }
    }
        return true;
    }

    //Insertion sort: Time complexity:o(n^2)
    public static int[] insertionSort(int[] a){
        if(a.length<=1)
        return a;
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int temp=i-1;
            while(temp>=0 && key<=a[temp]){
                a[temp+1]=a[temp];
                temp--;
            }
            a[temp+1]=key;
        }
        return a;

    }
   //Merge Sort: It uses divide and concur method by using recursion(.
   //Worst case: o(nlogn)
    public static int[] mergeSort(int[] a){
        split(a);
        return a;

    }
    //Merge Sort sub method:Splits the array into it's simplest form. 
    public static void split(int[] a){
        if(a.length<2)
          return;
        int mid=a.length/2;
        int[] left=new int[mid];
        int[] right=new int[a.length-mid];

        for(int i=0;i<=mid-1;i++)
         left[i]=a[i];
         for(int i=mid;i<a.length;i++)
         right[i-mid]=a[i];
         split(left);
         split(right);
         merge(left,right,a);
    
    }

    //Merge Sort:split sub method calls this to merge the split elements
    public static void merge(int[] left,int[] right,int[] a){
        int nleft=left.length;
        int nright=right.length;
        int i=0,j=0,k=0;
        while(i<nleft && j<nright){
            if(left[i]<=right[j])
            {
                a[k]=left[i];
                i++;k++;
            }
            else{
                a[k]=right[j];
                j++;k++;
            }
        }
        while(i<nleft){
            a[k]=left[i];
            i++;k++;

        }
        while(j<nright){
            a[k]=right[j];
                j++;k++;
        }

    }

    //QuickSort: Average case:theta(nlogn), worst case (o(n^2))
    
    public static int[] quickSort(int[] a){
        qSort(a,0,a.length-1);
        return a;
    }
    public static void qSort(int[] a,int start,int end){
        if(start<end){
            int partitionIndex=partition(a,start,end);
            qSort(a, start, partitionIndex-1);
            qSort(a, partitionIndex+1, end);
        }
    }
    public static int partition(int[] a,int start,int end){
        int pivot=a[end];
        int partitionIndex=start;

        for(int i=start;i<end;i++){
            if(a[i]<pivot){
                int temp=a[partitionIndex];
                a[partitionIndex]=a[i];
                a[i]=temp;
                ++partitionIndex;
            }
        }
        int temp=a[partitionIndex];
        a[partitionIndex]=a[end];
        a[end]=temp;
        return partitionIndex;


    }




}