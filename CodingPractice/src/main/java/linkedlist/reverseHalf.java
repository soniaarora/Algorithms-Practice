/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Hp
 */
public class reverseHalf {
    
    
    public static void main(String arg[]){
        
        LinkNode head = new LinkNode(1);
        head.next = new LinkNode(2);
        head.next.next = new LinkNode(3);
        head.next.next.next = new LinkNode(4);
        head.next.next.next.next = new LinkNode(5);
       
        
        LinkNode root = reverseHalf(head);
        
        print(root);
    }
    
    public static LinkNode reverseHalf(LinkNode head){
        
        LinkNode current = head;
        LinkNode prev = null;
        LinkNode middle = null;
        
        int sizeList = size(head);
        int i = 0;
        while( i < sizeList/2){
            
            middle = current;
            current = current.next;
            i++;
        }
        while(current != null){
            
            LinkNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;         
            
        }
        
        middle.next = prev;
        
        return head;
        
    }
    
    
    public static int size(LinkNode head){
        
        int count = 0;
        LinkNode curr = head;
        while(curr != null){
            
            count++;
            curr = curr.next;
        }
        return count;
    }
    
    public static void print(LinkNode root){
        while(root != null){
            System.out.print(root.val + " ");
            root = root.next;
        }
        
    }
}
