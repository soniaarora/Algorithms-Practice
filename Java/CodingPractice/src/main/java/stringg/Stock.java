/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Hp
 */
public class Stock {
     public static void main(String[] args) {
         
         
 List<List<String>> input  = new ArrayList();
       List<String> list = new ArrayList();
       list.add("P1:a");
       list.add("P2:b");
       list.add("P5:x");
       input.add(list);
       
       list = new ArrayList();
       list.add("P1:b");
       list.add("P3:q");
       list.add("P5:x");
       input.add(list);
       
       Map<String,String> map = new LinkedHashMap();
        
        for(List<String> stocks : input ){
            for(String stock : stocks)
            {
                String[] split = stock.split(":");                
                map.put(split[0], split[1]);
                 
                
            }

        }
                   for(String key : map.keySet())
            {
                System.out.println(key +" - "+ map.get(key));
            }
            System.out.println();
        

    }
    
}
