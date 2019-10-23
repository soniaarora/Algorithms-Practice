/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hp
 */
public class chocolatesnew {
    
    public static void main(String arg[]){
                int n = 10000;
        
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        
        int[] arr = {1, 1, 2};
        int M = 1000000007; 
        
        
        for(int i = 4 ; i <= n ; i++) 
        {
            int total = arr[0] + arr[2];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = total%M;
        }
        System.out.println(arr[2]); 
        
//        for(int i = 3; i<=n ; i++){
//            
//            list.add(list.get(i-1) + list.get(i-3));
//        }

        
        //System.out.println(list.get(list.size()-1)); 
      
        //int n = 1000;
        //System.out.println("Count for "+n+" is "+fib(n)); 
      
       
//        System.out.println("Count for "+n+" is "+count(n)); 
    }
    
    static int count(int n) 
    { 
        // table[i] will store count of solutions for 
        // value i. 
        int table[] = new int[n + 1], i; 
      
        // Initialize all table values as 0 
        Arrays.fill(table, 0); 
      
        // Base case (If given value is 0) 
        table[0] = 1; 
      
        // One by one consider given 3  
        // moves and update the table[] 
        // values after the index greater  
        // than or equal to the value of  
        // the picked move 
        for (i = 1; i <= n; i++) 
            table[i] += table[i - 1]; 
        for (i = 3; i <= n; i++) 
            table[i] += table[i - 3]; 
//        for (i = 10; i <= n; i++) 
//            table[i] += table[i - 10]; 
      
        return table[n]; 
    } 
    
    public static int fib(int n){
        
        if (n <= 2) 
          return 1; 
//        if(n == 1){
//            
//            return 1;
//        }
//        if(n == 3){
//            
//            return 2;
//        }
       return fib(n-1) + fib(n-3); 
    }
}
