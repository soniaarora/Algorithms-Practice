/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

/**
 *
 * @author Hp
 */
public class palindrom 
{
    public static void main(String arg[])
    {
    String ar = "racecar";
    
    int i = 0, j = ar.length()-1;
    
    while(i <= j)
    {
        if(ar.charAt(i) != ar.charAt(j))
        {
            System.out.println("false");
            break;
        }
        i++;
        j--;
    }
    System.out.print("true");
    
    
    }
    
}
