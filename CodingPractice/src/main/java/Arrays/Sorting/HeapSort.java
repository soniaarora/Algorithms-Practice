/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Hp
 */
public class HeapSort 
{
    public static void main(String arg[])
    {
        int[] arr = {15,5,3,9,11};
        
        sort(arr);
        print(arr);
    }
    
    public static void sort(int[] arr)
    {
        int len = arr.length;
        
        buildheap(arr, len);
        
        for(int i = 0 ; i< arr.length ; i++)
        {
            int temp = arr[0];
            arr[0] = arr[len - 1];
            
            arr[len - 1] = temp;
            
            len = len -1;
            
            Minheapify(arr, len, 0);
        }
        
    }
    
    public static void buildheap(int[] arr, int len)
    {
        for(int i = len/2 - 1; i >= 0 ; i--)
        {
            Minheapify(arr, len, i);
            
        }
    }
    
    public static void Minheapify(int[] arr, int len, int i)
    {
        int largest = i;
        int l = 2*i +1;
        int r = 2*i +2;
        
        if(l < len && arr[l] > arr[largest])
        {
            largest = l;
        }
        if(r < len && arr[r] > arr[largest])
        {
            largest = r;
        }
        if(largest != i)
        {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            
            Minheapify(arr, len, largest);
        }
        
    }
    
    public  static void print(int[] arr)
    {
        for(int i = 0; i< arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
