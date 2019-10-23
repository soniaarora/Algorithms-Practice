/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Hp
 */
public class intersect {
    
    public static void main(String[] arg){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res =findIntersect(nums1,nums2);
    }
    
    
    
    public static int[] findIntersect(int[] nums1, int nums2[]){
        
        int length1= nums1.length;
        int length2 = nums2.length;
        int[] maxArray,minorArray;
       if(length1 > length2 ){
           
           maxArray = Arrays.copyOf(nums1,length1);
              minorArray = Arrays.copyOf(nums2,length2);
       }
        else{
             maxArray = Arrays.copyOf(nums2,length2);
              minorArray = Arrays.copyOf(nums1,length1);
        }
        
       List<Integer> list = new ArrayList();
        
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i< maxArray.length ; i++){
            
            if(!map.containsKey(maxArray[i])){
                map.put(maxArray[i], 1);
            }
            
            else{
                map.put(maxArray[i], map.get(maxArray[i]) + 1);
            }
            
            // map.put(maxArray[i], map.getOrDefault(maxArray[i],0)+1);
        }
        
        for(int i = 0; i< minorArray.length;i++){
            int key = minorArray[i];
            
            
            if(map.containsKey(key) && (map.get(key)) > 0){
                int val = map.get(key);
                list.add(key);
                map.put(key,val-1);
            }
        }
        
        int[] res =  new int[list.size()];
        int i= 0;
        for(int val :list){
            res[i] = val;
            i++;
        }
        
        return res;
    }
    
}
