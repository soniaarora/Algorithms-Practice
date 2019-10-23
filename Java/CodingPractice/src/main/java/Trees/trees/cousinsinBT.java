/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hp
 */
public class cousinsinBT {
    
    public static void main(String arg[]){
        
        Trees root = new Trees(1);
        root.left = new Trees(2);
        root.right = new Trees(3);
        root.left.right = new Trees(4);
        root.right.right = new Trees(5);
        
        System.out.print(isCousins(root, 2, 5));
    }
    
    
    public static boolean isCousins(Trees root, int x, int y){
        
        Queue<Trees> q = new LinkedList();
        
        q.offer(root);
        
        Trees xData = null, yData = null;
        
        while(!q.isEmpty()){
        
            int size = q.size();
            
            while(size > 0){
                
                Trees node = q.poll();
                
                if(node.left != null){
                    
                    q.offer(node.left);
                    
                    if(node.left.data == x){
                        
                        xData = node.left;
                    }
                    if(node.left.data == y){
                        
                        yData = node.left;
                    }
                }
                
                if(node.right != null){
                    
                    q.offer(node.right);
                    if(node.right.data == x){
                        
                        xData = node.right;
                    }
                    if(node.right.data == y){
                        
                        yData = node.right;
                    }
                }
                if(xData != null && yData != null){
                    break;
                }
                size--;
            }
            
            if(xData != null && yData != null){
                
                return xData != yData;
            }
            
            if((xData == null && yData != null)|| (xData != null && yData == null) ){
                
                return false;
            }
        
    }
       return false; 
    }
}
