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
public class InvertArray 
{
    
    public int[][] invert(int[][] A)
    {
       for(int i = 0; i< A.length; i++)
       {
//       
           for(int j = 0; j < A[0].length/2 ; j++)
           {
               int temp = A[i][j];
              A[i][j] = A[i][A[0].length - j - 1];
              A[i][A[0].length - j - 1] = temp;
               
           }
       }
        return A;
    }     
    
    public static void print(int[][] A)
    {
        for(int i = 0; i< A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        
        InvertArray inv = new InvertArray();
        int[][] A = inv.invert(arr);
        
        print(A);
    }
    
}
