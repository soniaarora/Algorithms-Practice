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
public class MergeTrees {
    
    public Trees head1, head2;
    public Trees merge(Trees t1, Trees t2){
        
        if(t1 == null){
            
            return t2;
        }
        if(t2 == null){
            
            return t2;
        }
        
        t1.data = t1.data + t2.data;
        
        t1.left = merge(t1.left, t2.left);
        t2.right = merge(t1.right, t2.right);
        
       return t1;
    }
    
    public void print(Trees p ){
        
        if( p == null){
            
            return;
        }
        
        System.out.println(p.data + " ");
        print(p.left);
        print(p.right);
    }
    
    
    public static void main(String arg[]){
        
        Trees bs = new Trees(15);
       
       bs.left = new Trees(10);
       bs.right = new Trees(18);
        bs.left.left = new Trees(5);
        bs.left.right = new Trees(12);
        bs.right.left = new Trees(20);
        
        
        Trees bs1 = new Trees(12);
      
       bs1.left = new Trees(7);     
        bs1.left.left = new Trees(5);
        bs1.left.right = new Trees(9);
   
        MergeTrees m = new MergeTrees();
        Trees result = m.merge(bs, bs1);
        m.print(result);
        
        
    }
}
