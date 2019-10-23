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
public class fibonacci {
    
    
    public static void main(String arg[]){
        
        int result = fibonacci(9);
        
        System.out.println(result);
    }
    
    public static int fibonacci(int num){
        
        if(num <= 1){
            
            return num;
        }
        
        return fibonacci(num-1) + fibonacci(num -2);
    }
}
