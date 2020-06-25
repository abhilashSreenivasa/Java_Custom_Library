package com.custom;
// Singly Linked list consisting of only Integers.
public class LinkedLists {
    public Node head;  
    public Node last;
    public int size=0;

    class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }


    // Adds one element at a time to the end of the list.
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
        ++size;
        
    }

    //Prints the value of each node of list to the console.
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    
    //Removes first match of the passed element value. Doesn't do anything if value is not present in the list
    public void removeEle(int ele){
       Node temp=head;
       while(temp!=null && temp.next.val!=ele ){
           temp=temp.next;
       }
       if(temp==null)
       return;
       Node remove=temp.next;
       temp.next=temp.next.next;
        remove=null;
        --size;
    }
    
    //Inserts element at any position starting from 0.
    //Invalid position value will not do any operation
    public void insert(int val,int pos){
        Node node=new Node(val);
        if(pos==0){
            Node first=node;
            first.next=head;
            head=first;
            return;
            
        }
        int count=0;
        if(head==null || pos<=count ||pos>size)
        return;
        
        Node temp1=null;
        while(count<pos){
            if(temp1==null){
                temp1=head;++count;
            }
            else{
            temp1=temp1.next;
            ++count;
            }
            
        }
        Node temp2=temp1.next;
        temp1.next=node;
        node.next=temp2;
    }
   
    //Returns first Node.
    public Node peek(){
        return head;
    }


}