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
public class passZeros 
{
    public static void main(String arg[])
    {
    int[][] arr = {{1,1,0},{1,2,3},{2,4,5}};
    
   
     boolean fr = false, fc= false;
        int m = arr.length;
        int n = arr[0].length;
        
        for(int i = 0; i< m; i++)
        {
            for(int j = 0; j< n ; j++)
            {
                if(arr[i][j] == 0)
                {
                    if(i==0)
                        fr = true;
                    if(j == 0)
                        fc = true;
                    
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        for(int k = 1; k< m ; k++)
        {
            for(int f = 1; f<n ; f++)
            {
                if(arr[k][0] == 0 || arr[0][f] == 0)
                {
                    arr[k][f] = 0;
                }
            }
        }
        
        if(fr)
        {
            for(int i = 0 ; i< m ; i++)
            {
                arr[0][i] = 0;
            }
        }
        if(fc)
        {
            for(int j = 0; j< n; j++)
            {
                arr[j][0] = 0;
            }
        }
        
        print(arr);
    }
    
   public static void print(int[][] nums)
   {
       for(int i = 0; i< nums.length ; i++)
       {
           for(int j = 0; j< nums[0].length ; j++)
           {
               System.out.print(nums[i][j] + " ");
           }
           System.out.println();
       }
   }
   
}
