/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasht;

/**
 *
 * @author Hp
 */
public class shortestCompletingword 
        
      {
    public String domains(String licensePlate, String[] words){
    String license = licensePlate.toLowerCase();
        
        int[] target = new int[26];
        
        for(int i = 0; i <license.length(); i++)
        {
            if(Character.isLetter(license.charAt(i)))
            {
                target[license.charAt(i) -'a']++;
            }
            
        }
        for(int i : target){
            System.out.print(i);
        }
        System.out.println();
        int minlength = Integer.MAX_VALUE;
        String sol = "";
        for(int j = 0; j < words.length ; j++)
        {
            String temp = words[j].toLowerCase();
            
            if(match(temp, target) && temp.length() < minlength )
            {
                minlength = temp.length();
                sol = words[j];
            }
        }
     return sol;   
    }
    
    private static boolean match(String word, int[] map)
    {
        int[] charMap = new int[26];
        
        for(int i = 0; i< word.length(); i++)
        {
            if(Character.isLetter(word.charAt(i)))
            {
                charMap[word.charAt(i) - 'a']++;
            }
           
        }
        
        for(int i = 0 ; i< 25; i++)
        {
            if(map[i] != 0 && charMap[i] <map[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[])
    {
        
        String[] words = {"step","steps","stripe","stepple"};
        String target = "1s3 PSt";
        
        shortestCompletingword sh = new shortestCompletingword();
        sh.domains(target, words);
    }
    
}
