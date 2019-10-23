/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class increasingInorder {
    
    public Trees insert(Trees root, int val)
    {
         if(root == null){
           return (new Trees(val));           
            
        }
        
        else{
            
            Trees temp = null;
            if(root.data > val){
                
                temp = insert(root.left, val);
                root.left = temp;
                
            }
            else if(root.data < val){
                
                 temp = insert(root.right, val);
                root.right = temp;
            }
        }
        
     return root;   
    }
    
    public Trees incOrder(Trees root){
        
        List<Integer> vals = new ArrayList();
        inorder(root, vals);
        Trees ans = new Trees(0);
        Trees curr = ans;
        for(int v: vals){
            
            curr.right = new Trees(v);
            curr = curr.right;
        }
      
        return ans.right;
    }
    
    public void inorder(Trees root, List<Integer> vals){
        
        if(root == null){
            return;
        }
        inorder(root.left, vals);
        vals.add(root.data);
        inorder(root.right, vals);
        
        
    }
    public void print(Trees root){
        
        if(root == null){
            return;
            }
        
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
        
    }
    
    
    public static void main(String arg[])
    {Trees root = null;
        
        increasingInorder m = new increasingInorder();      
        
        root = m.insert(root, 20);
        root = m.insert(root, 13);
         root = m.insert(root, 18);
          root = m.insert(root, 22);
           root = m.insert(root, 4);
            root = m.insert(root, 30);           
        
            
            Trees res = m.incOrder(root);
            m.print(res);
        
    }
}
