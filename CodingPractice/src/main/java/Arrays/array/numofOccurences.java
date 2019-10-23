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
public class numofOccurences
{
    int count = 0;
    public static void main(String arg[])
    {
        numofOccurences num = new  numofOccurences();
        int[] arr = {2, 4, 6, 10};
        int count = num.findoccureneces(arr, 16, arr.length - 1);
        System.out.print(count);
    }
 
    
    public int findoccureneces(int[] arr, int sum, int n )
    {
        if(sum == 0)
        {
            return 1;
        }
        
        else if(sum < 0)
        {
            return 0;
        }
        else if(n < 0)
        {
            return 0;
        }
        else if(sum < arr[n])
        {
            return findoccureneces(arr, sum, n -1);
            
        }
        else
        {
            return ((findoccureneces(arr, sum - arr[n], n-1))) +(findoccureneces(arr, sum , n-1));
        }
        
        
        
    }
}
