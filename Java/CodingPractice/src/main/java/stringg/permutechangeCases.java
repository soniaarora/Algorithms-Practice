/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class permutechangeCases 
{
    
    public static void main(String arg[])
    {
        String S = "a1b1";
        List<String> list = new LinkedList();
        list = permute(S);
        
        for(String s: list)
        {
            System.out.println(s);
        }
        
        
        
    }
    
    public static  List<String> permute(String S)
    {
        
        if(S == null)
        {
            return new LinkedList();
        }
        List<String> list = new LinkedList();
        
       helper(S.toCharArray(), list, 0);
        
       for(String s :list)
       {
           System.out.println(s);
       }
       
       return list;
    }
    
    public static void  helper(char[] arr, List<String> list, int pos)
    {
        if(pos == arr.length)
        {
            list.add(new String(arr));
        }
        
        if(arr[pos] >= '0' && arr[pos] <='9')
        {
            helper(arr, list, pos +1);
            return;
        }
        
        arr[pos] = Character.toUpperCase(arr[pos]);
        helper(arr, list, pos +1);
        
        arr[pos] = Character.toLowerCase(arr[pos]);
        helper(arr,list, pos + 1);
        
        
    }
    
    
    
    
}
