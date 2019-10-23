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
public class mergesort 
{
public Node head;


    public Node merge(Node nd)
    { 
        
        Node middle = getmiddle(nd);
        
        Node nextofMiddle = middle.next;
        middle.next = null;
        Node left = nd;
        Node right = nextofMiddle;
        
       Node m =  sort(left, right);
       return m;
    }
    
    public Node sort(Node left, Node right)
    {
        Node node = new Node(0);
        Node ans = node;
        
        while(left != null && right != null)
        {
            if(left.data <= right.data)
            {
                node.next = left;
                left = left.next;
                
            }
            else
            {
                node.next = right;
                right = right.next;
                
            }
            node = node.next;
            
        }
        while(left != null)
        {
            node.next = left;
            left = left.next;
            node = node.next;
            
        }
        while(right != null)
        {
            node.next = right;
            right = right.next;
            node = node.next;
        }
        
        return ans.next;
    }
    
    public Node getmiddle(Node nod)
    {
     Node slowptr = nod;
     Node fastptr = nod.next;
     
     while(fastptr != null)
     {
         fastptr = fastptr.next;
         if(fastptr != null)
         {
             slowptr = slowptr.next;
             fastptr = fastptr.next;
         }
     }
     return slowptr;
     
    }

    public void push(int d)
    {
        Node n = new Node(d);
        n.next = head;
        head = n;
    }

    
    public String print(Node node)
    {String res = "";
       while(node != null)
       {
           res += node.data + "->";
           node = node.next;
       }
       
       System.out.println();
       
       res = res.substring(0,res.length() -2);
       return res;
    }
    public static void main(String arg[])
    {
        mergesort merge = new mergesort();
        merge.push(4);
        merge.push(3);
        merge.push(1);
        merge.push(8);
        merge.push(6);
        merge.push(2);
         System.out.print(merge.print(merge.head));
        Node n = merge.merge(merge.head);
        System.out.print(merge.print(n));
        
    }
    
    
}
