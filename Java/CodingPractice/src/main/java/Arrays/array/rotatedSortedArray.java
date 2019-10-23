*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.array;

/**
 *
 * @author Hp
 */
public class rotatedSortedArray 
        
{
    
    public static void main(String arg[])
    {
        int[] arr = {4,5,6,7,0,1,2};
        
        System.out.print(search(arr, 3));
    }
    
    public static int search(int[] arr, int n)
    {   
        int low = 0; int high = arr.length-1;
        int pivot = findPivot(arr, low, high);
        
        if(pivot == -1)
        {
            return binarySearch(arr, 0, high, n);
        }
        
        if(arr[pivot] == n)
        {
            return pivot;
        }
        if(arr[0] <= n )
        {
            return binarySearch(arr, 0, pivot -1 , n);
        }
        else
        {
            return binarySearch(arr, pivot+1, high, n);
        }
    }
    public static int binarySearch(int[] arr, int low, int high, int n)
    {
        
        
            int mid = (low+high)/2;
            if(arr[mid] == n)
            {
                return mid;
            }
            if(arr[mid] <= n)
            {
               return binarySearch(arr, mid+1, high, n);
                        }
            else
            {
               return binarySearch(arr, low, mid-1, n);
            }
    }
    public static int findPivot(int[] arr, int low, int high)
            
    {
        if(high<low)
        {
            return -1;
        }
        if(high == low)
        {
            return low;
        }
        int mid = (high + low)/2;
        
        if(mid< high && arr[mid] > arr[mid+1])
        {
            return mid;
        }
        if(low< mid && arr[mid] < arr[mid -1])
        {
            return mid -1;
        }
        if(arr[low] <= arr[mid])
        {
            return findPivot(arr, mid+1,high);
        }
        else
        {
            return findPivot(arr,low,mid-1);
        }
        
    }
    
}
