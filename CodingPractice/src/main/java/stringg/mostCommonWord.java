/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Hp
 */
public class mostCommonWord 

{
        public static void main(String arg[])
        {
            String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
            
            String[] banned = {"hit"};
            
            System.out.print("Common word:" + mostCommon(paragraph,banned));
        }
        
        public static String mostCommon(String paragraph, String[] banned)
        {
            int max = 0;
        String words = paragraph.toLowerCase();
        String value = "";
        String[] paragraph_words = words.split("[ !?',;.]+");
        for(String val: paragraph_words)
        {
            System.out.println(val);
        }
        List<String> list = Arrays.asList(banned);
        HashMap<String, Integer> map = new HashMap();
        
        for(String w: paragraph_words)
        {
            if(!map.containsKey(w))
            {
                map.put(w,1);
            }
            else
            {
                map.put(w,map.get(w)+1);
            }
        }
        
        for(Map.Entry<String,Integer> find:map.entrySet())
        {
            // boolean result = Arrays.stream(banned).anyMatch(find.getKey()::equals);
            
            if(!list.contains(find.getKey()))
            {
                if(find.getValue()> max)
                {
                    max = find.getValue();
                    value = find.getKey();
                }
            }    
        }
        
        return value;
        }
}
