
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Hp
 */
public class DFS 


{   public int V, v;
    LinkedList<Integer> adj[];
    
    public DFS(int d)
    { 
        V = d;
        adj = new LinkedList[d];
        for(int i = 0; i< V ;i++){
            adj[i] = new LinkedList();
        }
        
        
    }
    public void addEdge(int s, int d)
    {
     adj[s].add(d);   
    }
    
    public void DFS_find(int n)
    {
        boolean[] visit= new boolean[V];       
        
        
        
        final_DFS(n, visit);
        
    }
    
    public void final_DFS(int n,boolean[] visit){
        
//        Vector<Boolean> visited = new Vector<Boolean>(V);
//        Stack<Integer> stack = new Stack();
//        for(int i = 0; i < V; i++)
//        {
//            visited.add(false);
//        }
       visit[n] = true;
       System.out.print(n + " ");
//        stack.push(n);
//        while(!stack.isEmpty())
//        {
//           v = stack.peek();
//           
//           stack.pop();
//           
//           if(visited.get(v) == false)
//           {
//               System.out.print(v+ " ");
//               visited.set(v, Boolean.TRUE);
//           }
           
           Iterator<Integer> itr = adj[n].listIterator();
           while(itr.hasNext())
           {
               int num = itr.next();
               if(!visit[num])
               {
                   final_DFS(num,visit);
               }
           }
        
       
        
    }
    
    public static void main(String arg[])
    {
        DFS n = new DFS(4);
       n.addEdge(0, 1); 
        n.addEdge(0, 2); 
        n.addEdge(1, 2); 
        n.addEdge(2, 0); 
        n.addEdge(2, 3); 
        n.addEdge(3, 3);
        n.DFS_find(2);
    }
    
}
