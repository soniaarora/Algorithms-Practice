/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasht;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Hp
 */
public class subdomains 

{
    
    public List<String> domains(String[] domains)
    {
        List<String> res = new ArrayList();
        HashMap<String, Integer> map = new HashMap();
        for(String dom: domains)
        {
         String[] data  = dom.split(" ");
         int count = Integer.parseInt(data[0]);
         String[] val = data[1].split("\\.");
         String temp = "";
         for(int i = val.length -1; i >=0; i--)
         {
             temp = val[i] + (temp.equals("") ? temp : "." + temp);
            
                if(!map.containsKey(temp))
                {
                    map.put(temp, count);
                }
                else
                {
                    map.put(temp, map.get(temp) + count);
                }
            }
        }
        
        for(String d: map.keySet())
        {
            res.add(map.get(d) + " " + d);
        }
        
        return res;
    }
    
    public static void main(String arg[])
    {
        String[] arr = {"900 google.mail.com", "40 yahoo.mail.com"};
        
        subdomains s = new subdomains();
        List<String> st = s.domains(arr);
        
        for(String stt: st)
        {
            System.out.println(stt);
        }
    }
    
}
