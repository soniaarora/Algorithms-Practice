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
public class chocolates {
    
    
    public static void main(String arg[]){
        
        
        int input = 7;
        
        int[] arr = {1, 3};
        
        System.out.print(compute(input, arr));
        
    }
    
    public static int compute(int input, int[] arr){
        int ways = 0;
        for(int i = 0; i < arr.length ; i++){
            
            ways += Factorial(input)/(Factorial(arr[i])*Factorial(input - arr[i]));
        }
        
        
        return ways;
    }
    
    public static long nCr(int n, int r)
    {
        // naive: return Factorial(n) / (Factorial(r) * Factorial(n - r));
        return nPr(n, r) / Factorial(r);
    }
    public static long nPr(int n, int r)
    {
        // naive: return Factorial(n) / Factorial(n - r);
        return FactorialDivision(n, n - r);
    }

    private static long FactorialDivision(int topFactorial, int divisorFactorial)
    {
        long result = 1;
        for (int i = topFactorial; i > divisorFactorial; i--)
            result *= i;
        return result;
    }
    private static long Factorial(int i)
    {
        if (i <= 1)
            return 1;
        return i * Factorial(i - 1);
    }
    
    
}
