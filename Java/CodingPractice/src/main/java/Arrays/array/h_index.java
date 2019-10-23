/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Hp
 */
public class h_index {
    
    
    public static void main(String arg[]){
        
        
        int[] arr ={3,0,1,5,6};
        
        System.out.print(hIndex(arr));
    }
    
    public static int hIndex(int[] nums){
     Arrays.sort(nums);
     
     int[] revNums = new int[nums.length];
     int i = 0; int j = nums.length-1;
//    while( i <= j){
//        
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//        i++;
//        j--;
//    }
      int result = 0;
    for(int k = nums.length - 1; k >= 0 ; k-- )
    {
        
        int hIndex = nums.length - k;
        if(nums[k] >=hIndex){
            
            result = hIndex;
            
        }
        
    }
    return result;
        
    }
    
}
