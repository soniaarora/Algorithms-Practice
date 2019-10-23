/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class BinarySearch 
{
    
    public boolean search(int low, int high, int[] arr, int ele)
    {
        int mid;
        
        while(low <= high){
        
        mid = (low + high)/2;
        if(ele == arr[mid])
        {
            
            return true;
        }
        if(ele < arr[mid])
        {           
            high = mid-1;
            search(low, high, arr, ele);
        }
        if(ele > arr[mid])
          {
             low = mid +1;
             search(low, high, arr, ele);
          }
        
        }
        return false;
    }

        
        
           
    public static void main(String arg[]){
        
        int[] arr = {2,4,6,7,9,10,14};
        int low = 0,high = arr.length - 1;
        BinarySearch bs = new BinarySearch();
        boolean res = bs.search(low, high, arr, 5);
        System.out.print(res);
    
    
    }
    
}
