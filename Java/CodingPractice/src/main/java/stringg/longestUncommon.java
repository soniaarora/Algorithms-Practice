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
public class longestUncommon {
 
    public static void main(String[] args){
        
        String[] arr= {"abc", "cdc"};
        
        System.out.print(Uncommon(arr[0], arr[1]));
        
    }
    
    public static int Uncommon(String a, String b){
        
        if(a.equals(b)){
            
            return -1;
        }
        
        return Math.max(a.length(), b.length());
    }
    
    
}
