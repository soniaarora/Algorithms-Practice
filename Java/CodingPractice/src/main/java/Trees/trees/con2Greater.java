/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

/**
 *
 * @author Hp
 */
public class con2Greater 
{
    public static Trees root = null;
    int sum = 0;
    public Trees insert(Trees root,int d)
    {
        if(root == null)
        {
            return (new Trees(d));
        }
        else
        {
            Trees temp = null;
            if(root.data > d){
                temp = insert(root.left,d);
                root.left = temp;
            }
            else
            {
                temp = insert(root.right, d);
                root.right = temp;
            }
        }
        
        return root;
    }
    public Trees BST2Greater(Trees node )
    {
        if(node != null)
        {
            BST2Greater(node.right);
            sum += node.data;
            node.data = sum;
            
            BST2Greater(node.left);
            
        }
        return node;
    }
    public void print(Trees node)
    {
        if(node == null)
        {
            return;
        }
         print(node.left);
        System.out.print(node.data + " ");
       
        print(node.right);
        
        
        
    }
    
    public static void main(String arg[])
    {
     con2Greater con = new con2Greater();
     root = con.insert(root,4);
     root =  con.insert(root, 2);
     root = con.insert(root, 6);
     root = con.insert(root, 1);
     root = con.insert(root, 30);
     root = con.BST2Greater(root);
     con.print(root);
        
    }
    
}
