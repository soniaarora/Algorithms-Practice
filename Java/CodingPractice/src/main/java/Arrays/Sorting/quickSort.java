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
public class quickSort 
{
    
    public static void main(String arg[])
    {
        int[] arr = {40,20,35, 22, 11,56};
        quickSort quick = new quickSort();
        quick.quick(arr, 0, arr.length - 1);
        
        quick.print(arr);
    }
    
    public void print(int[] arr)
    {
        for(int i = 0; i< arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    
    public void quick(int[] arr,int low, int high)
    {
        if(low < high)
        {
            int i = partition(arr, low, high);
            
            quick(arr, low, i-1);
            quick(arr, i+1, high);
            
        }
    }
    
    public int partition(int[] arr, int l, int h)
    {
        int i = l-1;
        int pivot = arr[h];
        for(int j = l; j<h ; j++  )
        {
            if(arr[j] <= pivot)
            {
                i++;
//                System.out.println(i);
                swap(arr, i, j);
            }
        }
        
        swap(arr, i+1, h);
        return i+1;
    }
    
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
