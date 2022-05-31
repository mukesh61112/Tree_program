package com.company;
class TreeNode{
     int data;
     TreeNode left,right;
     TreeNode(int data)
     {
         this.data=data;
         right=left=null;
     }
}
public class Tree_CreateTree {
    TreeNode root;
    Tree_CreateTree(int key){
        root=new TreeNode(key);
    }
    Tree_CreateTree(){root=null;}
    public static void main(String [] args)
    {
        Tree_CreateTree tree=new Tree_CreateTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(3);

    }
}
