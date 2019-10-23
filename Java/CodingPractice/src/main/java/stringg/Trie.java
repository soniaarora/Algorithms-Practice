/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class Trie {
    
    TrieNode  root = new TrieNode('*');
    
    public  void insert(String name)
    {
        TrieNode crawl = root;
        for(int i = 0; i< name.length(); i++)
        {
            char v = name.charAt(i);  
            
           
            TrieNode node = addTrieNode(v, crawl.map);
            
            
            crawl = node;
        }
        crawl.isEnd = true;
    }
    
    public TrieNode addTrieNode(char value, Map<Character, TrieNode> map)
    {
        if(!map.containsKey(value))
        {
            map.put(value, new TrieNode(value));
        }
        
        
        return map.get(value);
            
    }
    
    public String common(String word)
    {
        String prefix = "";
        TrieNode crawl = root;
       for(int i = 0; i < word.length() ; i++)
       {    char v = word.charAt(i);
           if(!crawl.map.containsKey(v))
           {
             if(!crawl.isEnd)
             {
                 prefix = null;
             }
               return prefix;
           }
           prefix += v;
               
           crawl = crawl.map.get(v);
           
       }
       if(!crawl.isEnd)
       {
           prefix = null;
       }

        
        return prefix;
    }
    
   public static String longestWord(TrieNode root)
{   
    String result = "";
    TrieNode crawl = root;  
    Queue<TrieNode> queue = new LinkedList();
    
    queue.add(crawl);
    while(!queue.isEmpty())
    {
        TrieNode node = queue.poll();
         for(Map.Entry<Character, TrieNode> value : node.map.entrySet()){
             
             result += value.getKey();
             queue.add(value.getValue());
         }
        
    }
        
//    for(Map.Entry<Character, TrieNode> value : crawl.map.entrySet())
//    {
//        
//        result += value.getKey();
//        crawl = value.getValue();
//        
//        
//    }
    
    return result;
}
           
}
