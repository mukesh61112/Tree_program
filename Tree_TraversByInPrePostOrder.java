package com.company;
 class BTNode{
    int data;
    BTNode left,right;
    BTNode(int data)
    {
        this.data=data;
        left=right=null;
    }


}
public class Tree_TraversByInPrePostOrder {
    BTNode root;
    Tree_TraversByInPrePostOrder(){root=null;}
    void inOrder(BTNode temp)
    {

        if(temp==null)
            return;
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
    }
    void preOrder(BTNode temp)
    {

        if(temp==null)
            return;

        System.out.print(temp.data+" ");
        preOrder(temp.left);
        preOrder(temp.right);
    }
    void postOrder(BTNode temp)
    {

        if(temp==null)
            return;


        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data+" ");
    }
    void preOrder(){preOrder(root);}
    void postOrder(){postOrder(root);}
    void inOrder(){inOrder(root);}
    public static void main(String [] args)
    {
          Tree_TraversByInPrePostOrder tree=new Tree_TraversByInPrePostOrder();
          tree.root=new BTNode(1);
          tree.root.left=new BTNode(2);
          tree.root.right=new BTNode(3);
          tree.root.left.left=new BTNode(4);
          tree.root.left.right=new BTNode(5);


          tree.inOrder();
          System.out.println();
          tree.preOrder();
        System.out.println();
          tree.postOrder();

    }
}
