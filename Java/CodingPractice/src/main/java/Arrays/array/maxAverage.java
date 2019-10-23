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
public class maxAverage {
    
    public static void main(String arg[]){
        
        int[] arr = {1,12,-5,-6,50,3};
        
        System.out.print(findMaxAverage(arr, 4));
    }
    
     public static double findMaxAverage(int[] nums, int k) {
        
//        
//        if(nums.length < 0){
//            
//            return 0;
//        }
//        
//        double maxAverage = 0.00;
//        double currAverage = 0.00;
//        
//        int i = 0, j = 0;
//        int count = 0;int sum = 0;
//        while( i <nums.length){
//                count = 1;
//                sum += nums[i];
//                j = i+1;
//            
//            while(j < nums.length && count < k){
//                
//                sum += nums[j];
//                j = j+1;
//                count++;
//            }
//            if(count == k)
//            {
//                currAverage = (double)sum/k;
//                
//                if(currAverage > maxAverage){
//
//                    maxAverage = currAverage;
//                }
//            }     
//            
//            sum = 0;
//            i++;
//            
//            
//        }
        
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k ; i++){
            
            sum += nums[i];
            
        }
        
        for(int i = 0, j = k ; j< nums.length ; i++, j++ ){
            
            sum = sum - nums[i] +nums[j];
            maxSum = Math.max(sum, maxSum);
        }
        
        return (double)maxSum/k;
    }
    
}
