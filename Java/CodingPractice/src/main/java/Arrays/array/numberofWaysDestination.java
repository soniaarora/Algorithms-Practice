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
public class numberofWaysDestination 
{
    
    public static void main(String arg[])
    {
        int[][] arr= {{0,0,-1},{-1,0,0},{-1,0,0}};
        
        System.out.print(countWays(arr));
    }
    
    public static int countWays(int[][] arr)
    {
        if(arr[0][0] == -1)
        {
            return 0;
        }
        
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i][0] == 0)
            {
                arr[i][0] = 1;
            }
//            else
//            {
//                break;
//            }
        }
        
        for(int j = 1; j< arr[0].length ;j++)
        {
            if(arr[0][j] == 0)
            {
                arr[0][j] = 1;
            }
            
//            else
//            {
//                break;
//            }
        }
        
        
        for(int x = 1; x<arr.length;x++)
                {
                    for(int y =1; y< arr.length ;y++)
                    {
                        if(arr[x][y] == -1)
                        {
                            continue;
                        }
                        if(arr[x-1][y] > 0)
                        {
                            arr[x][y] = arr[x-1][y] + arr[x][y];
                        }
                        
                        if(arr[x][y-1] > 0)
                        {
                            arr[x][y] = arr[x][y] + arr[x][y-1];
                        }
                    }
                }
        
        return (arr[arr.length - 1][arr.length - 1] > 0)? arr[arr.length - 1][arr.length - 1]:0;
    }
    
}
