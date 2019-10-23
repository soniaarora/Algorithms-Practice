/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Hp
 */
public class minDistanceDelivery {
     public static boolean ASC = true;
    public static void main(String arg[]){
        
        int numDestinations = 3; 
        int[][] allocations = {{1 , 2}, {3, 4}, {1, -1}}; 
        int numDeliveries = 2; 
        
        minDistanceCoordinates(numDestinations, allocations, numDeliveries);
    }
    
    public static int[][] minDistanceCoordinates(int des, int[][] arr, int delivery){
        
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < arr.length ; i++ ){
            
            int dis = calculateDistance(arr[i][0], arr[i][1]);
            
            map.put(i, dis);
        }
        
        int[][] result = new int[delivery][2];
        
       Map<Integer, Integer> sortedMap = sortByComparator(map, ASC);
       int n = 0;
     
       for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()){
               
                       
            if(n == delivery){

                  break; 

             }
            
            int index = entry.getKey();
               result[n][0] = arr[index][0];
               result[n][1] = arr[index][1];
               
               
               n++;
               
       }
       
       return result;
        
    }
    
    
    public static int calculateDistance(int x, int y){
        
        return (int) Math.sqrt(x *x + y* y);
    }
    
    
   private static Map<Integer, Integer> sortByComparator(Map<Integer, Integer> unsortMap, final boolean order)
    {

        List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>()
        {
            public int compare(Entry<Integer, Integer> o1,
                    Entry<Integer, Integer> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });
        
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Entry<Integer, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}