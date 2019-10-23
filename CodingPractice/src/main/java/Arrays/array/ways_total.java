/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class ways_total 
{
   static int count = 0;
   
    public static void main(String arg[])
    {  List<List<Integer>> list = new ArrayList();
        List<Integer> curr = new ArrayList();
        ways_total total = new ways_total();
        int[] arr = {2, 3, 5};
        total.findWays(list, curr, arr, 10, 0);
        
        for(List<Integer> l : list)
        {
            System.out.println(l);
            count++;
        }
        
        System.out.println(count);
    }
    
    
    public void findWays(List<List<Integer>> res,List<Integer> curr, int[] nums, int remaining_amount, int index)
    {
        
    if(remaining_amount > 0)
    {
        for(int i = index; i< nums.length && remaining_amount >= nums[i] ; i++)
        {
            curr.add(nums[i]);
            findWays(res, curr, nums, remaining_amount - nums[i], index);
            curr.remove(curr.size() - 1);

        }
    }   
    else if(remaining_amount == 0 )
        {
            res.add(new ArrayList(curr));
        }
        
                    
    }
}
