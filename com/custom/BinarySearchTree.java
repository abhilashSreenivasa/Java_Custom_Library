package com.custom;
public class BinarySearchTree{
    public static Node root=null;
    class Node{
        public int val;
        public Node left;
        public Node right;
        public Node(int val){
            this.val=val;
        }
    }

    public Object insert(int val){
        Node node=new Node(val);
        if(root==null){
        root=node;
        return root;
        }
        Node cur=root;
        while(true){
            if(val<cur.val){
                if(cur.left==null){
                cur.left=node;
                return cur.left;
                }
                else
                cur=cur.left;
            }
            if(val>cur.val){
                if(cur.right==null){
                    cur.right=node;
                    return cur.right;
                }
                else
                cur=cur.right;
            }
            if(val==cur.val)
            return null;
        }


    }

    public static boolean search(int val){
        if(root==null)
        return false;
        Node temp=root;
        while(true){
            if(temp.val>val){
                if(temp.left==null)
                return false;
                else
                temp=temp.left;
            }
            else if(temp.val<val){
                if(temp.right==null)
                return false;
                else
                temp=temp.right;
            }
            else
            return  true;
        }


    }

    public static void printInOrder(){
        inOrder(root);
    }
    public static void printPreOrder(){
        preOrder(root);
    }
    public static void printPostOrder(){
        postOrder(root);
    }
    protected static void inOrder(Node node){
        if(node==null)
        return;
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }
    protected static void preOrder(Node node){
        if(node==null)
        return;
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
    protected static void postOrder(Node node){
        if(node==null)
        return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }

    

}