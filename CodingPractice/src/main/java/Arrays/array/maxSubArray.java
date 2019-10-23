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
public class maxSubArray {
    
    
    public int largestArray(int[] nums)
    {
        int[] dp = new int[nums.length];
        
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            dp[i] = nums[i]+ (dp[i-1]> 0 ? dp[i-1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        
        return max;
    }
    
    public static void main(String arg[])
    {
       int[] arr =  {-2,1,4,5,-3};
       
       maxSubArray max = new maxSubArray();
       System.out.println(max.largestArray(arr));
        
    }
    
}
