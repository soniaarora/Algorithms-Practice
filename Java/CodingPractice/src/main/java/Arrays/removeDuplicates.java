/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class removeDuplicates {
    
    
    public static void main(String arg[]){
        
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        
        int i = 0;
        
        for(int j = 1 ; j< arr.length ; j++){
            
            if(arr[j] != arr[i]){
                
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.print(i+1);
    }
    
}
