package com.custom;
public class LinkedLists {
    public Node head;  
    public Node last;

    class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }

    public void add(int val){
        Node node=new Node(val);
        if(head==null){
        head=node;
        }
        else{
              Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public void removeEle(int ele){
       Node temp=head;
       while(temp.next.val!=ele){
           temp=temp.next;
       }
       Node remove=temp.next;
       temp.next=temp.next.next;
        remove=null;
    }

}