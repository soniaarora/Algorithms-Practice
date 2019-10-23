/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hp
 */
public class maxWidthBT 
{
   static Trees head;
    public static void main(String arg[])
    {
        head = new Trees(20);
        head.left = new Trees(18);
        head.left.left = new Trees(14);
        head.right = new Trees(24);
        head.right.right = new Trees(30);
        
        maxWidthBT max = new maxWidthBT();
        System.out.print("Max width is: "+ max.maxwidth(head));
    }
    
    public int maxwidth(Trees root)
    {
        int max = Integer.MIN_VALUE;int start = 0, end = 0, curW = 0;
        HashMap<Trees, Integer> map = new HashMap();
        Queue<Trees> q = new LinkedList();
        
        q.offer(root);
        map.put(root, 1);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            
            for(int i = 0; i< size; i++)
            {
                Trees node = q.poll();
                if(i == 0)
                {
                    start = map.get(node);
                }
                if(i == size - 1)
                {
                    end = map.get(node);
                }
                
                if(node.left != null)
                {
                    map.put(node.left, 2 * map.get(node));
                    q.add(node.left);
                }
                if(node.right != null)
                {
                    map.put(node.right, 2 *map.get(node)+1);
                    q.add(node.right);
                    
                }
                
            }
            curW= end - start + 1;
            max = Math.max(max, curW);
            
        }
        
        return max;
    }
}
