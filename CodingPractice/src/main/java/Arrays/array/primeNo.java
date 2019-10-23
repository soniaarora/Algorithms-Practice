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
public class primeNo 
{
    public static void main(String arg[])
    {
        int number = 20, flag = 0;
        int count = 0;
        List<Integer> prime = new ArrayList();
        for(int i = 0; i <=20;i++)
       {
               flag = isPrime(i);
               
             if(flag == 1)
             {
                 prime.add(i);
                 count++;
             }
       }
        
        for(int val :prime)
        {
            System.out.print(val + " ");
        }
        System.out.println("Total primes:" +count);
    }
    
    public static int isPrime(int number)
    { int flag = 0;
       if(number==0 || number==1)
       {
           return flag;
       }
       for(int i = 2; i<=number; i++)
       {
           
           return ((number % i) == 0)? 0 :1;
          
       }
      
      return -1;
    }
}
