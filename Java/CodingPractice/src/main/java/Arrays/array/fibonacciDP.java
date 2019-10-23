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
public class fibonacciDP {
    
    public static int[] memo;
    public static void main(String arg[]){
        
        System.out.print(fibonacci(9));
    }
//    
    public static int fibonacci(int n){


   memo  = new int[n+1];



    memo[0] = 0;
    memo[1] = 1;


    for(int i = 2; i <= n ; i++ ){
         memo[i] = memo[i-1] +memo[i-2];

    }
     return memo[n];




    }
//      public static int fibonacci(int n){
//
//        if(n <=1){
//
//            return n;
//        }
//
//        else if(memo[n] != 0){
//
//             return memo[n];
//         }
//
//        else{
//         return memo[n] = fibonacci(n-1)+fibonacci(n-2);
//
//        }
    


}
