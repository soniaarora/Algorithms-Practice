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
public class palindrome 
{
    public static void main(String arg[])
    {
        int num = 123;
        int original_num = 121;
        
        int rev = 0;
        
        while(num > 0)
        {
            rev = rev*10 + num % 10;
            
            num = num/10;
            
        }
        if(rev == original_num)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}
