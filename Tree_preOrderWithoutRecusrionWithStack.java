package com.company;

import java.util.Stack;

public class Tree_preOrderWithoutRecusrionWithStack {
    Node1 root;
    void preOrderWithoutRecursion()

    {
        if (root == null)
            return;
        java.util.Stack<Node1> stack=new Stack<Node1>();

        Node1 curr=root;
        while(curr!=null || stack.size()>0)
        {
            while(curr!=null){
                System.out.print(curr.data + " ");
                stack.push(curr);
                curr=curr.left;
            }
            curr = stack.pop();


            curr=curr.right;
        }
    }
    public static void main(String [] args)
    {
        Tree_preOrderWithoutRecusrionWithStack obj=new Tree_preOrderWithoutRecusrionWithStack();
        obj.root= new Node1(1);
        obj.root.left=new Node1(2);
        obj.root.right=new Node1(3);
        obj.root.left.left=new Node1(4);
        obj.root.left.right=new Node1(5);
        obj.preOrderWithoutRecursion();

    }
}
