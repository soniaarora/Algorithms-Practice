/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.HashSet;

/**
 *
 * @author Hp
 */
public class reverseVowels
{
    public static void main(String arg[])
    {
       String s = "hello";
       
       char[] arr = s.toCharArray();

        HashSet<Character> set = new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int i = 0 , j = arr.length - 1;


      while(i <=j){

          if(!set.contains(arr[i])){
              i++;
              continue;

          }

          if(!set.contains(arr[j])){

              j--;
              continue;
          }
        char temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j--;
      }


      System.out.print(String.valueOf(arr));
    }
    
}
