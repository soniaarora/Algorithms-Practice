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
public class majorityElement {
    public static void main(String arg[]){
        
            int[] arr= {1,2,3,5,5,5};
            
            
            int candidate = 0;
            int count = 0;
//            for(int i = 0; i<arr.length ; i++){
//                
//                if(count == 0){
//                    
//                    candidate = arr[i];
//                    
//                }
//                
//                if(arr[i] == candidate){
//                    
//                    count++;
//                }
//                else{
//                    
//                    count--;
//                }
//                
//                [1,1,1,3,3,2,2,2]
//            }
//            
//            System.out.print(candidate);
            Arrays.sort(arr);
//            1,2,2,2,2,3,5
          
//            for(int i = 1; i < arr.length ; i++){
//                
//              if(arr[i] == arr[i-1]){
//                  count++;
//                  
//                   if(count >= (int)arr.length/2){
//                    
//                    candidate = arr[i];
//                }
//               
//                   
//              }
//               else{
//                    count = 1;
//                } 
//                
//                              
//            }
//            System.out.print(candidate);
            
            
            
            int currentMax = arr[0];
            int Max = arr[0];
            int currentCount = 1;
            int maxCount = 1;
            
            
            for(int i = 1; i< arr.length ; i++){
                
                if(arr[i-1] != arr[i]){
                    
                    currentMax = arr[i];
                    currentCount = 1;
                }
                else{
                    currentCount++;
                                       
                }
                
                if(currentCount > maxCount){
                 
                    Max = arr[i];
                    maxCount = currentCount; 
                }
            }
            
//            if(currentCount > maxCount){
//                
//                Max = currentMax;
//            }
            
            
            System.out.print(Max);
    }
}

