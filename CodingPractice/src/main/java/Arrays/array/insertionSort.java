/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Hp
 */
public class insertionSort 
{
    public static void main(String arg[])
    {
        
        int[] arr = {5, 2, 6, 3};
        
        for(int i = 1; i< arr.length; i++)
        {
            for(int j = i; j > 0 ;j--)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
