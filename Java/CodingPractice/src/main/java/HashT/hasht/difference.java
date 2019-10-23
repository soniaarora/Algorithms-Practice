/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasht;

import java.util.HashMap;

/**
 *
 * @author Hp
 */
public class difference 
{
    
    public char findDifference(String s, String t)
    {
        char res = '\0';
        HashMap<Character, Integer> map = new HashMap();
        
        for(int i = 0; i< s.length(); i++)
        { char d = s.charAt(i);
         
         if(!map.containsKey(d))
         {
             map.put(d,1);
         }
         else{
            map.put(d, map.get(d)+1);
         }
        }
        
        for(int j = 0; j<t.length(); j++)
        {
            char c = t.charAt(j);
            int val = map.get(c);
            if(!map.containsKey(c) || (val < 1)){
                
                res = c;
                return res;
            }
            else{
            map.put(c, val - 1);
            }
        }
        
        return res;
    
    }
    
    public static void main(String arg[])
    {
        String one = "a";
        String two = "aa";
        
        difference d = new difference();
        char result = d.findDifference(one, two);
        System.out.print(result);
    }
    
}
