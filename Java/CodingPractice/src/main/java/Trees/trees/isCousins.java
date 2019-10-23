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
public class isCousins {
 
    class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
    
        if(root == null)
        {
            return true;
        }
        
        List<TreeNode> findPath1 = new ArrayList();
        findPath1 = findPath(root.left, x, findPath1);
        List<TreeNode> findPath2 = new ArrayList();
        findPath2 = findPath(root.right, y, findPath2);
        
        int size = Math.max(findPath1.size(), findPath2.size());
        
        for(int i = size -1; i< size; i++){
            
            if(findPath1.get(i).val != findPath2.get(i).val){
                
                return true;
            }
        }
        
        return false;
    }
    
    
    public List<TreeNode> findPath(TreeNode root, int x, List<TreeNode> list){
        
        
        if(root == null){
            
            return list;
        }
         if(root.val == x ){
             
             return list;
         }
             
        list.add(root);
        
        //return findPath(root.left,x,list) &&  findPath(root.right,x,list);
         return null;
       
    }
}
    
}
