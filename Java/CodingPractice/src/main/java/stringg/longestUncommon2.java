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
public class longestUncommon2 {
    
    
    public static void main(String arg[]){
        
        String[] arr = {"aba", "cdc", "eae"};
        
        System.out.print(unCommon(arr));
        
    }
    
    public static int unCommon(String[] strs){
         int res=-1, n=strs.length;
        for (int i=0; i<n; i++){
            if (strs[i].length()<res) continue;
            int j=-1;
            while(++j<n) if (i!=j && isSubsequence(strs[i], strs[j])) break;
            if (j==n) res=Math.max(res, strs[i].length());
        }
        return res;
        
    }
    
    public static boolean isSubsequence(String a, String b){
        int i=0, j=0;
        while(i<a.length() && j<b.length()){ 
            if (a.charAt(i)==b.charAt(j++)){
                i++;
            } 
        }
        return i==a.length();
    }
}
