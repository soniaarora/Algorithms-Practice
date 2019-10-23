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
public class calculation 
{
    
    public static void main(String arg[])
    {
        
         String exp = "6+9-12";
         
         System.out.print(calculate(exp));
        
     
       
    }
    
    public static int calculate(String exp)
    {   
        //
        int len = exp.length();
        int result = 0;
        String  term = "";
        int i = 0;
        while(Character.isDigit(exp.charAt(i)) && i < len)
        {
            term += exp.charAt(i);
            i++;
            
        }
        result = result + Integer.valueOf(term);
       
        
        for(int k=i; k < exp.length();k++)
        {
            if(exp.charAt(k) == '+' || exp.charAt(k) == '-')
            {
                String secondTerm = "";
                int j = k + 1;
                while(j<len && exp.charAt(j) != '+' && exp.charAt(j) != '-')
                {
                    secondTerm = secondTerm + exp.charAt(j);
                    j++;
                }
                
                int second = Integer.valueOf(secondTerm);
                 if(exp.charAt(k) == '+')
                 {
                     result = result  + second;
                     
                 }
                 else 
                 {
                     result = result - second;
                     
                 }                
                
            }
            
            
        }
        
    return result;
    
}

}