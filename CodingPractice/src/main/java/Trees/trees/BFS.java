/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/**
 *
 * @author Hp
 */
public class BFS 
{
    
    public int V;
    LinkedList<Integer> adj[];
    
    public BFS(int v){
        
       V = v;
        adj = new LinkedList[v];
        for(int i = 0; i< V ;i++){
            adj[i] = new LinkedList();
        }
    }
    
    public void addEdge(int s, int d)
    {
        adj[s].add(d);
    }
    
    public void BFS(int n)
    {
        boolean[] visited = new boolean[V];
        
        Queue<Integer> queue = new LinkedList();
        visited[n] = true;
        queue.add(n);
        
        while(!queue.isEmpty())
        {
            int ele = queue.peek();
           System.out.print(ele + " ");
            queue.remove();
            
            
            Iterator<Integer> itr = adj[ele].listIterator();
            while(itr.hasNext())
            {
                int val = itr.next();
                if(!visited[val])
                { visited[val] = true;
                    queue.add(val);
                }
                
            }
            
        }
        
    }
    
    public static void main(String arg[])
    {
        BFS n = new BFS(4);
         n.addEdge(0, 1); 
        n.addEdge(0, 2); 
        n.addEdge(1, 2); 
        n.addEdge(2, 0); 
        n.addEdge(2, 3); 
        n.addEdge(3, 3);
        n.BFS(2);
        
        
    }
    
}
