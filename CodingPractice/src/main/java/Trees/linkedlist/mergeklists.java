/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*;
import java.util.List;

/**
 *
 * @author Hp
 */
public class mergeklists 
{
    public static void main(String arg[])
    {
        mergeklists k = new mergeklists();
        Node head = new Node(8);
        head.next = new Node(4);
        head.next.next = new Node(9);
        
        Node head1 = new Node(4);
        head1.next = new Node(1);
        head1.next.next = new Node(3);
        
        Node head2 = new Node(10);
        head2.next = new Node(2);
        head2.next.next = new Node(0);
        
        Node[] n = new Node[3];
               n[0] = head;
               n[1] = head1;
               n[2] = head2;
//            for(Node v : n)
//            {
//                System.out.println(v.data);
//            }
            Node res = k.merge(n);
            
            while(res != null)
            {
                System.out.print(res.data + "->");
                
                res = res.next;
            }
//            
    }
    
    public Node merge(Node[] lists)
    {
        Node main_head = new Node(0);
        Node temp = main_head;
        
        List<Integer> li = new ArrayList();
        for(Node v: lists)
        {
            while(v != null)
            {
                li.add(v.data);
                v = v.next;
            }
        }
        
        Collections.sort(li);
        
        
        for(int i = 0; i < li.size() ; i++ )
        {
            Node n = new Node(li.get(i));
            temp.next = n;
            temp = temp.next;
        }
        return  main_head.next;
    }
    
}
