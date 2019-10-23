/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

/**
 *
 * @author Hp
 */
public class HeapSort 
        
{
    
    public void heap_sort(int[] arr, int length)
    {
        for(int i = length/2 -1 ; i>= 0; i--)
        {
            max_heapify(arr, length, i);
        }
        
        int heap_size = length;
        for(int j = length-1; j>=0 ; j--)
        {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            
            heap_size = heap_size-1;
            max_heapify(arr, heap_size, 0);
        }
    }
    
    
    public void max_heapify(int[] arr, int length, int n)
    {
        
        int largest = n;
        int left = 2*n +1;
        int right = 2*n +2;
        
        if( left <= length -1 && arr[left]> arr[n])
        {
            largest = left;
        }
        if(right <= length -1 && arr[right] > arr[largest])
        {
            largest = right;
        }
        
        if(largest != n)
        {
            int temp = arr[n];
            arr[n] = arr[largest];
            arr[largest] = temp;
            
            max_heapify(arr, length, largest);
        }
    }
    
    public void print(int[] nums)
    {
        
        for(int i = 0; i< nums.length; i++)
        {
            
            System.out.print(nums[i]+ " ");
        }
        System.out.println(" ");
    }
    public static void main(String arg[])
    {
        HeapSort heap = new HeapSort();
        
        int arr[] = {5, 7, 45, 78, 6, 1, 90};
        
        int length = arr.length;
        
        heap.heap_sort(arr, length);
        heap.print(arr);
        
    }
    
    
    
}
