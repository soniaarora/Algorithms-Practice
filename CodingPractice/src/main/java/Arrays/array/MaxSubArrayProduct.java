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
public class MaxSubArrayProduct {
    
    public static void main(String arg[])
    {
    int[] nums = {1,-2,5,-3};
    
    int len = nums.length;
    int maxNum = nums[0];
    int minNum = nums[0];
    int result = nums[0];
    
    for(int i = 1; i< len ; i++ )
    {
        
            if(nums[i] < 0)
            {
                int temp = maxNum;
                maxNum = minNum;
                minNum = temp;
                        
                
            }
            
            maxNum = Math.max( nums[i], nums[i] * maxNum);
            minNum = Math.min(nums[i], nums[i] * minNum);
            
            
           
            result = Math.max(result, maxNum);
        
    }
    System.out.println(result);
    }
    
    
    
}
