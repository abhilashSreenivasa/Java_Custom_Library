package com.custom;

public class ListStack{
    
    public Node top;
    public Node bottom;
    public int size;
    class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public void push(int val){
        Node node=new Node(val);
        if(top==null){
            top=node;
            bottom=node;
            ++size;
        }
        else{
            
           top.next=node;
            top=top.next;
            ++size;
        }
    }
    public Object pop(){
        if(top!= null || bottom!=null){
       
       Node temp;
       int popEle=top.val;
       temp=bottom;
       System.out.println(temp);
       while(temp.next!=top){
           temp=temp.next;
       }
       
       temp.next=null;
       --size;
       return popEle;
    }
    else
    return "Stack is empty";
    }
    
    public void printStack(){
        Node temp=bottom;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public boolean isEmpty(){
        if(top==null && bottom==null)
          return true;
        return false;
    }



    }
    
