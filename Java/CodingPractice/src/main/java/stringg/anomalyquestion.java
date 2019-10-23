/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.io.*;
import java.util.*;

/**
 *
 * @author Hp
 */
public class anomalyquestion 

{
    
     public static void main(String[] args) {
    
    String badgeRecords[][] = new String[][] {
      {"Martha",   "exit"},
      {"Paul",     "enter"},
      {"Martha",   "enter"},
      {"Martha",   "exit"},
      {"Jennifer", "enter"},
      {"Paul",     "enter"},
      {"Curtis",   "enter"},
      {"Paul",     "exit"},
      {"Martha",   "enter"},
      {"Martha",   "exit"},
      {"Jennifer", "exit"}
        
      
    };
    
                         
      List<List<String>> anomalies = anomaliesList(badgeRecords);
      
    System.out.println(anomalies);
    

  }
  
  public static List<List<String>> anomaliesList(String[][] badgeRecords)
  {
    
    List<List<String>> anomalies = new ArrayList<List<String>>();
    List<String> anomaly1 =  new ArrayList<String>();
     List<String> anomaly2 =  new ArrayList<String>();
    
    
    HashMap<String, String> map = new HashMap();
    
    for(String[] val : badgeRecords)
      { 

          
      if(map.containsKey(val[0]))
         {
            String value = map.get(val[0]);
            if( value.equals(val[1]))
           {
             anomaly1.add(val[0]);
           }
           else
           {
             map.put(val[0], val[1]);
           }
      }   
          
                               
  
         else
         {
             if(val[1].equals("exit"))
             {
               anomaly2.add(val[0]);
             }
             else
             {
               map.put(val[0],val[1]);
             }
           
         }
         
       }  
          
      for(Map.Entry<String, String> m : map.entrySet())
         {
           String value = m.getValue();
           if(value != "exit")
             
           {
            anomaly1.add(m.getKey()); 
           }
         }
         
      anomalies.add(anomaly1);
      anomalies.add(anomaly2);          
      
       return anomalies;                  
      }
      
    
}
