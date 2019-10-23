/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.HashSet;

/**
 *
 * @author Hp
 */
public class longestSubstringWithoutRepeatingCharacters {
    
    
  
    public static void main(String arg[]) {
        
        String s = "abcabcbb";
        int maxSoFar = 0;
//        String tempString = "";
//        for(int i = 0; i < s.length(); i++)
//        {
//            int j = i+1;
//            
//            tempString += s.charAt(i);
//            
//            while(tempString.indexOf(s.charAt(j)) == -1 && j<=s.length())
//            {
//                tempString += s.charAt(j);
//                j++;
//                if(j <= s.length())
//                {
//                    break;
//                }
//            }
//            
//            maxSoFar = Math.max(maxSoFar, j-i);
//            tempString = "";
//            
//        }

        HashSet<Character> set = new HashSet();
        int i = 0, j = 0;
        while(i < s.length() && j < s.length())
        {
           if(!set.contains(s.charAt(j)))
           {
               set.add(s.charAt(j));
               j++;
               maxSoFar = Math.max(maxSoFar, j -i);
           }
           else
           {
               set.remove(s.charAt(i));
                i++;
           }
           
           
        }
        
            System.out.print(maxSoFar);
    }
}
    
