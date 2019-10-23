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
public class mergeSort 
{
    public static void main(String arg[])
    {
        int[] arr = {14,20,5,9,10, 30, 20};
        mergeSort merge = new mergeSort();
        
        merge.mergeSort(arr,0, arr.length - 1);
        merge.print(arr);
        
    }    
    
    public void print(int[] arr)
    {
        for(int i = 0; i< arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void mergeSort(int[] arr, int low, int high)
    {
        
        if(low < high)
        {
            int mid = (low+high)/2;            
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);            
            merge(arr, low, mid, high);
        }              
        
    }
    
    public void merge(int[] nums, int low, int mid, int high)
    {
        int len1= mid - low +1;
        int len2 = high - mid;
        
        int[] len_one = new int[len1];
        int[] len_two = new int[len2];
        
        for(int i = 0; i< len1; i++)
        {
            len_one[i] = nums[low+i];
        }
        for(int j = 0; j <len2 ; j++)
        {
            len_two[j] = nums[mid+1+j];
        }
        int x = 0,y = 0,k = low;
        while(x < len1 && y < len2)
        {
            if(len_one[x] <= len_two[y])
            {
                nums[k] = len_one[x];
                x++;
                k++;
            }
            else
            {
                nums[k] = len_two[y];
                y++;
                k++;
            }
        }
        
        while(x < len1)
        {
            nums[k] = len_one[x];
            x++;
            k++;
        }
        while(y <len2)
        {
            nums[k] = len_two[y];
            y++;k++;
        }
    }
    
}
