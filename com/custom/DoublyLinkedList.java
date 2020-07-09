package com.custom;

public class DoublyLinkedList {

    public Node head;
    public Node tail;
    public int size=0;

    class Node{
        public Node next;
        public Node prev;
        public int val;
        public Node(int val){
            this.val=val;
        }
    }

    public void add(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            ++size;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
            tail=tail.next;
            ++size;
        }

    }
    public void printListForward(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public void printListReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.prev;
        }
    }
   



}