/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.HashMap;

/**
 *
 * @author Hp
 */
public  class TrieNode {
    
    public char charName;
    public HashMap<Character, TrieNode> map = new HashMap();
    boolean isEnd;
    
    public TrieNode(char c)
    {
        this.charName = c;
    }
    
    
}
