/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.array;

import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class sumofDistinctNumbers {
    
    
    public static void main(String arg[]){
        
        int[] arr = {3,1,2,2,5,4,4,4};
        
        System.out.print(sumDigits(arr));
    }
 
    public static int sumDigits(int[] arr){
       Arrays.sort(arr);
     int sum = arr[0];
     int prev = arr[0];
     
     for(int i = 1; i< arr.length ; i++){
         
         if(arr[i] == prev){
             
             prev = arr[i];
//             sum += prev;
         }
         
         else{
             
             prev = arr[i];
              sum += prev;
         }
     }
     
     return sum;
    }
    
    
}
