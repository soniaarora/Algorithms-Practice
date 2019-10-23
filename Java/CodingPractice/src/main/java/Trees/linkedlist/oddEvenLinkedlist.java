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
public class oddEvenLinkedlist 
{  ListNode head ;
    public static void main(String arg[])
    {         
        
        oddEvenLinkedlist OE = new oddEvenLinkedlist();
        OE.head = new ListNode(1);
        OE.head.next = new ListNode(2);
        OE.head.next.next = new ListNode(3);
        OE.head.next.next.next = new ListNode(4);
        OE.head.next.next.next.next = new ListNode(5);
        OE.head.next.next.next.next.next = new ListNode(6);
        OE.head.next.next.next.next.next.next = new ListNode(7);
        OE.head.next.next.next.next.next.next.next = new ListNode(8);
        ListNode head = OE.oddEvenList(OE.head);
        
        while(head != null)
        {
            System.out.print(head.data + " " );
            head = head.next;
        }
    }
    
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null|| head.next == null)
        {
            return head;
        }
        ListNode curr = head;
        int len = 0;
        while(curr != null)
        {
            curr = curr.next;
            len++;
        }
        
        curr = head;
        ListNode root = new ListNode(0);
        root.next = curr;
        ListNode separate = new ListNode(-1);
        separate.next = curr.next;      
         
         ListNode even = curr.next;  
        for(int i = 1 ; i<=len ; i++)
        {
            if(even != null && even.next != null)
        {
            if(i%2 != 0)
            {
                if(curr.next.next != null)
                {   
                    ListNode data = curr.next.next;
                    curr.next = data;
                    curr = data;
                } 
            }
            else
            {   if(even.next.next != null)
                {
                    ListNode prev = even.next.next;
                        even.next = prev; 
                        even = prev;
                }
             else
             {
                 even.next = null;
             }
            }
        }
    }
       
        
        curr.next = separate.next;
        
        return root.next;
    }
}
    

