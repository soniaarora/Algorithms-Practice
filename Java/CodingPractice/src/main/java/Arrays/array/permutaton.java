/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class permutaton 
{

    public static void main(String arg[])
    {
        int n = 3; int k = 3;
        
        List<Integer> numbers = new ArrayList();
        int[] factorial = new int[n+1];
        StringBuilder sb = new StringBuilder();
        
        int sum = 1;
        factorial[0] = 1;
        for(int i = 1; i<=n ; i++)
        {
            sum *= i;
            factorial[i] = sum;
        }
        
        for(int j = 1; j <=n ; j++)
        {
            numbers.add(j);
        }
       
        
        k--;
        
        for(int i = 1; i <=n; i++)
        {
            int index = k/ factorial[n -i];
            sb.append(numbers.get(index).toString());
            numbers.remove(index);
            
            k -= index * factorial[n-i];
            
        }
        
        System.out.print(sb.toString());
    }
    
}
