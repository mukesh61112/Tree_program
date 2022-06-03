package com.company;

import java.util.LinkedList;
import java.util.Queue;

class BTNodeLO{
    int data;
    BTNodeLO left,right;
    BTNodeLO(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

public class Tree_levelOrder {
    BTNodeLO root;
    public  void levelOrder()
    {
        Queue<BTNodeLO> q=new LinkedList<BTNodeLO>();

        q.add(root);
        while(q.size()>0)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                root=q.remove();
                System.out.print(root.data+" ");

                if(root.left!=null)
                     q.add(root.left);
                if(root.right!=null)
                     q.add(root.right);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {

        Tree_levelOrder obj=new Tree_levelOrder();
        obj.root=new BTNodeLO(1);
        obj.root.left=new BTNodeLO(2);
        obj.root.right=new BTNodeLO(3);
        obj.root.left.left=new BTNodeLO(4);
        obj.root.left.right=new BTNodeLO(5);
        obj.root.right.left=new BTNodeLO(6);
        obj.root.right.right=new BTNodeLO(7);
        obj.levelOrder();

    }
}
