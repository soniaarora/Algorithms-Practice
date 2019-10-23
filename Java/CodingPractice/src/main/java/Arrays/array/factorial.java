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
public class factorial {
 
    
    public static void main(String[] arg){
        
        int result = factorial(4);
        
        
        System.out.print(result);

    }
    
    public static int factorial(int num){
        
        if(num == 0 || num == 1){
            
            return 1;
        }
        
        return num * factorial(num - 1);
        
    }
    
    
}
