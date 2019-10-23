/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Hp
 */
public class max_depth {
    
    public Trees insert(Trees root, int val){
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

    
    public int max_depth(Trees root){
        
        if(root == null){
            
            return 0;
        }
        
        int depth= 0;
        
        Queue<Trees> queue = new LinkedList();
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
             while(size-- > 0){
                    Trees n = queue.poll();
                    if(n.left != null){
                        
                        queue.add(n.left);
                    }
                    if(n.right != null){
                        
                        queue.add(n.right);
                    }
                    
             }
            depth++;
        }
        
        
        return depth;
    }
    
    public int min_depth(Trees root){
        
        if(root == null){
            
            return 0;
        }
        
        return Math.min(min_depth(root.left), min_depth(root.right))+1;
        
        
    }
    
    
    public static void main(String arg[]){
       Trees root = null;
        max_depth m = new max_depth();
        root = m.insert(root, 20);
        root = m.insert(root, 13);
         root = m.insert(root, 18);
          root = m.insert(root, 22);
           root = m.insert(root, 4);
            root = m.insert(root, 30);
        System.out.println(m.max_depth(root));
        System.out.println(m.min_depth(root));
        
    
    } 
}
