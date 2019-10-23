/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hp
 */
public class findSubsets 

{
    public static void main(String arg[])
    {
        int[] nums = {2,1,3};
        
        List<List<Integer>> list = subsets(nums);
        for(List<Integer> l : list)
        {
            System.out.println(l);
        }
        
    }
    
    public static List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        backtrack(list, new ArrayList(), nums, 0);
        
        return list;
        
    }
    
    public static void backtrack(List<List<Integer>> temp, List<Integer> res,int[] arr, int start  )
    {
        temp.add(new ArrayList<>(res));
        
        for(int i = start ; i < arr.length ;i++)
        {
            res.add(arr[i]);
            System.out.print(res);
            backtrack(temp, res, arr, i +1);
            res.remove(res.size() - 1);
        }
    }
}
