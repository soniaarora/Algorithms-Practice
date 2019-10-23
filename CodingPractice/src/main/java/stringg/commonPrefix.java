/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

/**
 *
 * @author Hp
 */
public class commonPrefix {
    
    
     public static void main(String[] args)
    {
        
    String[] word = {"are", "area", "base","cat", "children", "basement"};
      Trie t = new Trie();
    
//        StringBuilder commonPrefix = new StringBuilder();
        
        for(int i = 0; i< word.length ; i++)
        {
            t.insert(word[i]);
        }
        
       System.out.print(t.common("caterly"));
    }
}
