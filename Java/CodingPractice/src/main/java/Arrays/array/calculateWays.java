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
public class calculateWays 
{ 
    public static void main(String arg[])
    {
        int[] arr = {1, 2, 3,4};
        int sum = 5;
        
        calculateWays cal = new calculateWays();
        System.out.println(cal.Ways(arr, sum, 0));
    }
    
    public int Ways(int[] arr, int sum, int index)
    {
        if(sum == 0)
        {
            return 1;
        }
        
        if(index >= arr.length)
        {
            return 0;
        }
        if(sum < 0)
        {
            return 0;
        }
        
        int count = 0;
        while(sum >= 0)
        {
            count += Ways(arr, sum, index+1);
            sum = sum - arr[index];
            
            
        }
        
        return count;
    }
    
}
