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
public class selectionSort 
{
    public static void main(String arg[])
    {
        int arr[] = {3,1, 6, 5};
        
        for(int i = 0; i< arr.length - 1; i++)
        {
            int min = i;
            
            for(int j = i+1; j < arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i =0 ; i< arr.length ;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
