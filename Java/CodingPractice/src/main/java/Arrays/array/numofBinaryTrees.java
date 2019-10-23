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
public class numofBinaryTrees 
{
    public static void main(String arg[])
    {
        int[] arr= {10, 11,12,13,14};
        
        System.out.print("Number of trees: " + numberofBT(arr));
    }
    
    public static int numberofBT(int[] arr)
    {
        int[] count = new int[arr.length+1];
        
        count[0] = 1;
        count[1] = 1;
        for(int i = 2 ;i< arr.length ; i++)
        {
            for(int j = 0; j < i ; j++)
            {
                int x = i - j - 1;
                count[i] += count[j] * count[x];
            }
        }
        
        return count[arr.length-1];
    }
}
