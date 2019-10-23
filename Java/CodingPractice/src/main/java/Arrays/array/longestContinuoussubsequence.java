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
public class longestContinuoussubsequence {
    
    public static void main(String arg[]){
        
        
        int nums[] = {2,2,2,2,2};
         if(nums.length == 0 ){
            
            System.out.print(0);
        }
        
        
        int  max = 0, j = 0;
        
//        while( i < nums.length && j < nums.length){            
//            
//            
//            while( nums[j] < nums[j+1]){              
//               
//                
//                max = Math.max(max, ((j +1) -i)+1);
//                
//                if(j < nums.length){
//                    
//                    j++;
//                }
//            }
//            i++;
//        }
        

           for(int i = 0; i < nums.length ; i++){
               
               if( i > 0 && nums[i-1] >= nums[i]){
                   
                   j = i;
               }
               max = Math.max(max, i-j + 1);
           }
        System.out.print(max);
    }
    
    
    
    
}
