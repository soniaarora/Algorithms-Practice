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
public class coinChangeproblem 
{
    
    public static void main(String arg[])
    {
        int[] arr = {2,3,4};
        int total = 7;
        
//        System.out.println(findCount(arr, total));
        int[] res = findCount(arr, total);
        for(int i :res)
        {
            System.out.println(i);
        }
            
    }
    
    public static int[] findCount(int[] arr, int total)
    {
        
        int[] numbers = new int[total+1];
        numbers[0] = 0;
        
        for(int i = 1; i < numbers.length ; i++)
        {
            numbers[i] = Integer.MAX_VALUE;
        }
        
        for(int i = 1; i<= total ; i++)
        {
            
            for(int j = 0 ; j < arr.length ;j++ )
            {
               if(arr[j]<= i)
               {
                   int sub_res = numbers[i-arr[j]];
                   if(sub_res != Integer.MAX_VALUE && sub_res+1 < numbers[i])
                   {
                       numbers[i] = sub_res+1;
                   }
               }
                
                
            }
        }
                
        return numbers;
    }
    
}
