/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays.array;

/**
 *
 * @author Hp
 */
public class removeDuplicates 
        
{
    
    public int removeDup(int[] nums)
    {
         int pos = 0;
        if(nums.length == 0)
        {
            return 0;
        }
        
        for(int i = 1 ; i< nums.length; i++)
        {
            if(nums[i] != nums[pos])
            {
                nums[++pos] = nums[i];
               
            }
        }
        
        return ++pos;    
        
        
    }
    
    public void print(int[] nums, int val)
    {
        for(int i= 0; i< val; i++)
        {
            System.out.print(nums[i] +" ");
        }
    }
    
    public static void main(String arg[])
    {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates rem = new removeDuplicates();
        int val = rem.removeDup(arr);
        System.out.println("Final length:" + val);
        rem.print(arr, val);
    }
    
}
