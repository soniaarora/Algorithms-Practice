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
public class sumArraylessthantarget {
    
public static void main(String arg[]){
    
    int arr[] = {4,5,9,2};
    
//    (2,4,5,9);
    int res = findTotalminCount(arr, 11);
    System.out.print(res);

}    
    

public static int findTotalminCount(int[] arr, int target){
    
    int result = 0; 
    
    Arrays.sort(arr);
    int lo = 0;
    int high = arr.length - 1;
    while(lo < high){
        for(int i = 0; i < arr.length ; i++){

            if(arr[lo] + arr[high] < target){

                result += high - lo;
                lo++;
            }
            else {

                high--;
            }
        }
    }
    
    return result;
}
}
