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
public class longestPrefix 
{
    public static void main(String arg[])
    {
        String[] arr = {"trail", "train","tray"};
        
        longestPrefix p = new longestPrefix();
        String ans = p.longestPre(arr);
        System.out.println(ans);
    }
    
    public String longestPre(String[] str)
    {
        String res = "";int pos = 0;
        int max_len = Integer.MIN_VALUE;
        for(int i = 0 ; i< str.length; i++)
        {
            int len = str[0].length();
            if(len > max_len)
            {
                max_len = len;
                pos = i;
            }
            
        }
        String temp = str[pos];
        str[pos] = str[0];
        str[0] = temp;
        
        for(int i = 0; i < str[0].length(); i++)
        {
            char c = str[0].charAt(i);
            
            for(int j = 1 ; j < str.length ; j++)
            {
                if(str[j].charAt(i) != c)
                {
                    return res;
                }
            }
                
          res += c;      
        }
            
        return res;
    }
  }
