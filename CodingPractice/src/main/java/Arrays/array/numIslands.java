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
public class numIslands {
    
public static void main(String[] arg){
  char[][] grid ={ {'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};    
    
      
        int ROW = grid.length;
        int COL = grid[0].length;
        
        int count = countIslands(grid, ROW, COL);
        
     System.out.println(count);
        
    }
    
    public static int countIslands(char[][] grid,int  ROW, int COL)
    {
        boolean[][] visible = new boolean[ROW][COL];
        int count = 0;
        
        for(int i = 0; i < ROW ; i++)
        {
            for(int j = 0; j < COL ; j++)
            {
                if(isSafe(grid, i, j, visible, ROW, COL))
                {   
                         DFS(grid, i, j,ROW, COL, visible);
                         count++;
                }
            }
            
            
        }
        return count;
        
    }
    
    
    public static void DFS(char[][] grid, int row, int col, int ROW, int COL, boolean[][] visible)
    {
        int[] xAxis = {-1, 0, 1, 0};
        int[] yAxis = {0, 1, 0, -1};
        
        visible[row][col] = true;
        
        for(int k = 0; k < 4 ; k++)
        {
            int newX = row + xAxis[k];
            int newY = col +yAxis[k];
            if(isSafe(grid, newX, newY, visible, ROW, COL))
            {
                DFS(grid, newX, newY, ROW, COL, visible);
            }
        }
        
        
        
    }
    
    
    public static boolean isSafe(char[][] grid, int row, int col, boolean[][] visible, int ROW, int COL)
    {
        return (row < ROW) && (col < COL ) && (row >= 0) && (col >= 0) && (grid[row][col] == '1') && (!visible[row][col]);
        
    }
    

    
}
