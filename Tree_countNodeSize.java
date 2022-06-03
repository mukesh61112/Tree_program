package com.company;
import  java.util.Stack;
class Node3{
    int data;
    Node3 left,right;
    Node3(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class Tree_countNodeSize {
    Node3 root;

    void inOrderWithoutRecursion()

    {
        if (root == null)
            return;
        Stack<Node3> stack=new Stack<Node3>();

        Node3 curr=root;
        while(curr!=null || stack.size()>0)
        {
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr = stack.pop();


            curr=curr.right;
          //  System.out.print(curr.data + " ");
        }
    }


    public int count(Node3 root)
    {
        if(root==null)
            return 0;
        int l=count(root.left);
        int r=count(root.right);
        int ans=l+r+1;
        return  ans;
    }
    public int nodeSum(Node3 root)
    {
        if(root==null)
            return 0;

        return  root.data+nodeSum(root.left)+nodeSum(root.right);
    }
    public int maxNode(Node3 root)
    {
        if(root==null)
             return Integer.MIN_VALUE;
        int lmax=maxNode(root.left);
        int rmax=maxNode(root.right);
        return Math.max(root.data ,Math.max(maxNode(root.left),maxNode(root.right)));
    }
    public static void main(String [] args)
    {
        Tree_countNodeSize obj=new Tree_countNodeSize();
        obj.root= new Node3(1);
        obj.root.left=new Node3(2);
        obj.root.right=new Node3(3);
        obj.root.left.left=new Node3(4);
        obj.root.left.right=new Node3(5);
       // obj.inOrderWithoutRecursion();
       System.out.println(obj.count(obj.root));
        System.out.println(obj.nodeSum(obj.root));
        System.out.println(obj.maxNode(obj.root));

    }
}
