/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Comparator;
/**
 *
 * @author Hp
 */
public class topKelements {
    
    
    public static void main(String arg[]){
        
        int[] arr = {20,30,40,100,50,65,25};
        
        topKelements(arr, 4);
    }
    
    public static void topKelements(int[] arr, int k){
        
        
//        PriorityQueue<Integer> queue = new PriorityQueue(arr.length, Collections.reverseOrder());
           PriorityQueue<Integer> queue = new PriorityQueue(k);
           for(int i = 0 ; i< k ; i++){
               
               queue.add(arr[i]);
           }
                   
           
           
//         PriorityQueue<Integer> queue = new PriorityQueue<Integer>(arr.length, new lengthComparator());
       
        
          
        for(int i = k; i<arr.length ; i++){
            
            if(arr[i] > queue.peek()){
                
                queue.remove();
                queue.add(arr[i]);
            }
                
            
        }
        
       for(int i : queue){
           System.out.print(i+ " ");
       }
    }   
  
    
}
class lengthComparator implements Comparator<Integer> {
              

    @Override
    public int compare(Integer i, Integer j) {
          if(i < j){
                return 1;
            }
            else if(i > j ){
                
                return -1;
            }
            
            return 0;
    }
    }
    