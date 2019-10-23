/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class longestCommon
{
    public static void main(String arg[])
    {
        String s = "banana";
        System.out.print(lengthOfLongestSubstring(s));
        
    }
     public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        String res= "";
        int i,j = 0;
        for (i = 0; i < n; i++)
            for (j = i + 1; j <= n; j++)
                if (allUnique(s, i, j))
                    if(ans < j-i)
                        
                        ans =  j - i;
//                        res = s.substring(i,j);
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    
}
