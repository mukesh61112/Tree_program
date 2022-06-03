package com.company;
import  java.util.Stack;
class Node2{
    int data;
    Node2 left,right;
    Node2(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class Tree_deletNode {
    Node2 root;

    void inOrderWithoutRecursion()

    {
        if (root == null)
            return;
        Stack<Node2> stack=new Stack<Node2>();

        Node2 curr=root;
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
    void inOrder()

    {
        if (root == null)
            return;
        Stack<Node2> stack=new Stack<Node2>();

        Node2 curr=root;
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
    public int deleteNode(Node2 root)
    {

    }
    void MorrisTraversal(Node2 root)
    {
        Node2 current, pre;

        if (root == null)
            return;

        current = root;
        while (current != null)
        {
            if (current.left == null)
            {
                System.out.print(current.data + " ");
                current = current.right;
            }
            else {
                /* Find the inorder
                    predecessor of current
                 */
                pre = current.left;
                while (pre.right != null
                        && pre.right != current)
                    pre = pre.right;

                /* Make current as right
                   child of its
                 * inorder predecessor */
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }

                /* Revert the changes made
                   in the 'if' part
                   to restore the original
                   tree i.e., fix
                   the right child of predecessor*/
                else
                {
                    pre.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                } /* End of if condition pre->right == NULL
                 */

            } /* End of if condition current->left == NULL*/

        } /* End of while */
    }

    public static void main(String [] args)
    {
        Tree_deletNode obj=new Tree_deletNode();
        obj.root= new Node2(1);
        obj.root.left=new Node2(2);
        obj.root.right=new Node2(3);
        obj.root.left.left=new Node2(4);
        obj.root.left.right=new Node2(5);
        // obj.inOrderWithoutRecursion();
        obj.inOrder();
        System.out.println();
        obj.MorrisTraversal(obj.root);
        System.out.println();


        obj.inOrder();
        System.out.println();
        System.out.println(obj.deleteNode(obj.root));

    }
}
