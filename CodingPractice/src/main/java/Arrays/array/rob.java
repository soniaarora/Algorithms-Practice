/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class rob {
    static int[] memo;
    public static void main(String arg[])
    {
        
       int[] arr = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
//        
//        
//        int temp= 0, last = 0, now = 0;
//        
//        for(int i = 0; i< arr.length ; i++)
//        {
//            temp = now;
//            now = Math.max(last+arr[i],now );
//            last = temp;
//        }
//        
//        
//       System.out.print(now);

        memo = new int[arr.length+1];
        Arrays.fill(memo, -1);
        
        int result = rob(arr, arr.length - 1);
        
        System.out.print(result);
    }
    
    public static int rob(int[] arr, int n){
        
        if(n < 0){
            
            return 0;
        }
        
        if(memo[n] >= 0){
            
            return memo[n];
        }
        
        int result =  Math.max(rob(arr, n-2) + arr[n] , rob(arr, n-1));
        memo[n] = result;
        return result;
    }
    
    
    
}
