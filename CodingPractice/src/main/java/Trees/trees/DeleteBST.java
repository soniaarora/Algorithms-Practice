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
public class DeleteBST {
    
    public Trees insert(Trees root, int val){
        
        if(root == null){
            
            return (new Trees(val));
        }
        else{
            Trees temp = null;
            if(root.data >  val){
        
                temp = insert(root.left,val);
                root.left = temp;
                temp.parent = root;
            } 
            else{
                temp = insert(root.right,val);
                root.right = temp;
                temp.parent = root;
            }
    }
    return root;
    }
    public void delete(Trees z){
        
        Trees y, x ,root;
        
       if(z.left == null || z.right == null){
           y = z;
       }
       else{
           y = successor(z);
       }
       
       if( y.left != null){
           
           x = y.left;
       }
       else{
           x = y.right;
       }
       
       if(x != null){
           x.parent = y.parent;
       }
       if(y.parent == null){
           
           root = x;
       }
       else if( y == y.parent.left){
           
           y.parent.left = x;
       }
       else{
           y.parent.right = x;
       }
//       if(y.data != z.data){
//           z.data = y.data;
//       }
        
    }
    
    public Trees successor(Trees node){
        
        if(node == null){
            
            return null;
        }
        
        while(node.right != null)
        {
            return minValue(node.right);
        }
        
        Trees y = node.parent;
        if(y != null && node == y.right){
            node = y;
            y = node.parent;
        }
        
        return node;
    }
    
   Trees minValue(Trees n){
       Trees current = n;
       while(current.left != null){
           
           current = current.left;
       }
       return current;
   }
    public void print(Trees n){
        
        if(n == null){
            return;
        }
        print(n.left);
        System.out.print(n.data +" ");
        print(n.right);
    }
    public static void main(String arg[])
    {
        
        DeleteBST de = new DeleteBST();
        Trees root = null;
        
       root =  de.insert(root, 15);
         root =  de.insert(root, 12);
          root = de.insert(root, 5);
        root =   de.insert(root, 10);
         root =  de.insert(root, 8);
        
        de.print(root);
        System.out.println();
        de.delete(root.left.left);
        de.print(root);
    }    
}
