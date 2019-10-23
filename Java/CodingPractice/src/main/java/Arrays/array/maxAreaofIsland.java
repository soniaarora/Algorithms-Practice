/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Hp
 */
public class maxAreaofIsland
{public static int[] xRows = {-1,0,1,0};
    public static int[] yCols = {0,1,0,-1};
        public static void main(String arg[])
        {
            
            int[][] grid = {{0,1,0},{1,1,0},{0,1,0}};
              System.out.print(maxAreaOfIsland(grid));
            
        }
        
         
    public  static int maxAreaOfIsland(int[][] grid) 
    {
        int Row = grid.length;
        int Col = grid[0].length;
        
        int max = 0;
        boolean[][] visible = new boolean[Row][Col];
        
        for(int i = 0; i < Row ; i++)
        {
            for(int j = 0 ; j< Col ; j++)
            {
                if(isSafe(i, j, Row, Col, grid, visible))
                {
                    
                    max = Math.max(max,DFS(i, j, Row, Col, grid, visible));                                 
                    
                    
                }
                
                
            }
        }
        return max;
        
    }
    
    
    public static int DFS(int row, int col, int Row, int Col, int[][] grid,boolean[][] visible)
    {
        int count = 1;
        visible[row][col] = true;
        
        for(int i = 0; i< xRows.length; i++)
        {
            int newX = row+ xRows[i];
            int newY = col + yCols[i];
            
            if(isSafe(newX, newY, Row, Col, grid, visible))
            {
                
                count += DFS(newX, newY, Row, Col,grid,visible);
            }
        }
        return count;
        
    }
    
    public static boolean isSafe(int row, int col, int Row, int Col, int[][] grid, boolean[][] visible)
    {
        return (row<Row) && (row>=0) && (col < Col )&& (col >= 0) && (grid[row][col] == 1) && (!visible[row][col]) ;
    }
                
}
