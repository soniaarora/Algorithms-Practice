
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class DistanceMinObstacle {
    
    public static void main(String arg[]){
        
        List<List<Integer>> input  = new ArrayList();
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(0);
        list.add(0);
        input.add(list);
        
        list = new ArrayList();
        list.add(1);
        list.add(0);
        list.add(0);
        input.add(list);
        
        list = new ArrayList();
        list.add(1);
        list.add(9);
        list.add(1);
        input.add(list);
        
        
        int result = removeObstacle(3, 3, input);
        System.out.print(result);
    
    
    }
    
    private static final int row[] = { -1, 0, 0, 1 };
    private static final int col[] = { 0, -1, 1, 0 };
    static int  removeObstacle(int numRows, int numColumns, List<List<Integer>> lot)
    {
       
        int i = 0;
        int j= 0;
        boolean[][] visited = new boolean[numRows][numColumns];
        
        Queue<Node> queue = new LinkedList();
        visited[i][j] = true;
        
        int minDist = Integer.MAX_VALUE;       
        int val = lot.get(0).get(0);
        queue.add(new Node(0 ,0, val, 0));
        
        while(queue.size() > 0)
        {
            Node node = queue.poll();
            int dist = node.dist;
            i = node.x;
            j = node.y;
            if(node.val == 9)
            {
                minDist = dist;
                break;
                //minDist = Math.min(dist, minDist);
                
            }
            for(int k  = 0; k < row.length; k++)
            {
                int nextCellX = i + row[k];
                int nextCellY = j + col[k];
                if(isValid(lot, nextCellX, nextCellY, visited, numRows, numColumns))
                {
                    visited[nextCellX][nextCellY] = true;
                    queue.add(new Node(nextCellX, nextCellY, lot.get(nextCellX).get(nextCellY), dist + 1));
                }
            }
        }
        
        if(minDist == Integer.MAX_VALUE)
        {
            return -1;
        }
        
        return minDist;
    }
    
    static boolean isValid(List<List<Integer>> lot, int row, int col, boolean[][] visited, int numRows, int numColumns){
        
    return (row >= 0) && (row < numRows) && (col >=0) && (col < numColumns)
            && (lot.get(row).get(col) != 0) && (!visited[row][col]);
    }    
}

class Node 
{
    public int x, y, val, dist;
    
    Node(int x, int y, int val, int dist)
    {
        this.x = x;
        this.y = y;
        this.val = val;
        this.dist = dist;
    }
}
