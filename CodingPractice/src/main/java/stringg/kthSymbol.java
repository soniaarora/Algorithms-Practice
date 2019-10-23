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
public class kthSymbol 
{
    public static void main(String arg[])
    {
        int N = 4, k =8 ;
        
//        String S ="0";
        System.out.print(number(N, k));
        
//        while(N>0)
//        {
//           String T = "";
//            for(int i = 0; i< S.length(); i++)
//            {
//                if(S.charAt(i) == '0')
//                {
//                    T += "01"; 
//                }
//                else if(S.charAt(i) == '1')
//                {
//                   T += "10";
//                }                
//               
//            }
//          
//            N--;
//           S = T; 
//        }
//        
//       int res = 0;
//        for(int i = 0; i< S.length(); i++)
//        {
//             
//            if(i == k)
//            {
//                char c = S.charAt(i);
//                res = Character.getNumericValue(c);
//                break;
//            }
//        }
//        

    }
    
    public static int number(int n, int k)
    {
        if(n == 0)
        {
            return 0;
        }
        
        if(k%2 ==0)
        {
            return (number(n-1, k/2) == 0)? 1: 0;  
        }
        
        else
        {
            return (number(n-1, (k+1)/2) == 0)? 0: 1;
        }
    }
}
