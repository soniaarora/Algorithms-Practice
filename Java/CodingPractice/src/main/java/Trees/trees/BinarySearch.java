/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.trees;

/**
 *
 * @author Hp
 */
public class BinarySearch {
    
    public Trees head = null;
    public Trees Search(Trees head, int d){
        
        if(head == null){
            
            return null;
        }
        if(head.data == d){
            
            return head;
        }
        
        if(head.data > d){
            
            return Search(head.left, d);
        }
        else{
            return Search(head.right,d);
        }
        
    }
    
    public static void main(String arg[]){
        
        
       BinarySearch bs = new BinarySearch();
       bs.head = new Trees(15);
       bs.head.left = new Trees(10);
       bs.head.right = new Trees(18);
        bs.head.left.left = new Trees(5);
        bs.head.left.right = new Trees(12);
        bs.head.right.left = new Trees(20);
        
        Trees ans = bs.Search(bs.head,4);
            if(ans == null){
                System.out.println("Node not found");
                
                
            }
            else{
                System.out.println("Node:" + ans.data);
                
            }
    }
    
}
