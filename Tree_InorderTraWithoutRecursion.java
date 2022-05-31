package com.company;
import  java.util.Stack;
class Node1{
    int data;
    Node1 left,right;
    Node1(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class Tree_InorderTraWithoutRecursion {
    Node1 root;

    void inOrderWithoutRecursion()

    {
        if (root == null)
            return;
        Stack<Node1> stack=new Stack<Node1>();

        Node1 curr=root;
        while(curr!=null || stack.size()>0)
        {
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");

            curr=curr.right;
        }
    }
    public static void main(String [] args)
    {
        Tree_InorderTraWithoutRecursion obj=new Tree_InorderTraWithoutRecursion();
         obj.root= new Node1(1);
         obj.root.left=new Node1(2);
         obj.root.right=new Node1(3);
         obj.root.left.left=new Node1(4);
         obj.root.left.right=new Node1(5);
         obj.inOrderWithoutRecursion();

    }
}
