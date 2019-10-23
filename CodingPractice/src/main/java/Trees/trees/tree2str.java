/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Hp
 */
public class tree2str {
    
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
    public String convStr(Trees root)
    {
        StringBuilder sb = new StringBuilder();
        
        if(root == null){
            
            return "";
        }
        
        Stack<Trees> stack = new Stack();
        Set<Trees> set = new HashSet();
        
        stack.push(root);
        while(!stack.isEmpty()){
            
            Trees node = stack.peek();
            
            if(set.contains(node)){
                stack.pop();
                sb.append(")");
                
            }
            else{
                set.add(node);
                sb.append("(" + node.data);
                if(node.left == null && node.right != null){
                    
                    sb.append("()");
                } 
                    if(node.right != null){
                        
                        stack.push(node.right);
                    }
                    if(node.left != null){
                        stack.push(node.left);
                    }
                
                
            }
        }
       
        return sb.substring(1, sb.length() - 1);
    }
   
 
    
    public static void main(String arg[]){
        
        Trees root = null;
        tree2str m = new tree2str();
        root = m.insert(root, 20);
        root = m.insert(root, 13);
         root = m.insert(root, 18);
          root = m.insert(root, 22);
           root = m.insert(root, 4);
            root = m.insert(root, 30);
        
            System.out.print(m.convStr(root));
    }
    
    
}
