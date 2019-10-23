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
public class longestWordinDictionary {
    
    public static void main(String arg[])
    {
        Trie t = new Trie();
        String[] words = {"w","wo","wor","worl", "world"};
        for(int i = 0; i < words.length ; i++)
        {
            t.insert(words[i]);
        }       
     
        System.out.print(t.longestWord(t.root));

        
    }
    
    
}
