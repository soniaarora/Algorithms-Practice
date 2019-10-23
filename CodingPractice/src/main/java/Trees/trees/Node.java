/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

import java.util.List;

/**
 *
 * @author Hp
 */
public class Node {
    
    public int data;
    public List<Node> children;
    
    public Node(){
        
        
    }
    
    public Node(int val, List<Node> children){
        
        this.data = val;
        this.children = children;
    }
    
}
