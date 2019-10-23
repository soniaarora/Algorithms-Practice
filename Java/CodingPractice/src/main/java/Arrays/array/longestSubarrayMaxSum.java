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
public class longestSubarrayMaxSum {
    
    public static void main(String arg[])
    {
        int arr[] = {-1,2,4,-3,7};
        
//       int maxSumhere = arr[0];
//       int maxSum = arr[0];
//       int count = 1;
//       int countHere = 1;
//       
//       
//       for(int i =1 ; i< arr.length ; i++)
//       {
//           int cum_sum = maxSumhere + arr[i];
//           if(cum_sum > arr[i])
//           {
//               maxSumhere += arr[i];
//               count++;
//           }
//           else
//           {
//               maxSumhere = arr[i];
//               count = 1;
//           }
//           
//           if(maxSumhere > maxSum)
//           {
//               maxSum = maxSumhere ;
//               countHere = count;
//           }
//           
//           
//       }
//      System.out.println(countHere); 
      
    
    
    int[] dp = new int[arr.length];
    dp[0] = arr[0];
    
    int max = dp[0];
    
    for(int i = 1; i< arr.length ; i++){
        
        dp[i] = arr[i]+(dp[i-1]>0? dp[i-1]: 0);
        max = Math.max(max, dp[i]);
        
    }
    System.out.print(max);
    
    }  
    
}
