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
public class isLongPressedName
{
    public static void main(String arg[])
    {
        String name = "alex";
        String typed = "alyexx";
        
        isLongPressedName l = new isLongPressedName();
        System.out.println(l.longPressed(name, typed));
    }
    
    public boolean longPressed(String name, String typed)
    {
        int j = 0; 
        
        for(char c: name.toCharArray())
        {
            if(j == typed.length())
            {
                return false;
            }
            if(typed.charAt(j) != c)
            {
                        if(j == 0 || typed.charAt(j-1) != typed.charAt(j))
                        {
                            return false;
                        }
                        
                        char curr = typed.charAt(j);
                        
                        while(j < typed.length() && typed.charAt(j) == curr)
                        {
                            j++;
                        }
                        
                        if(j == typed.length() || typed.charAt(j) != c)
                        {
                            return false;
                        }
             }    
            j++;
            
        }
        
        return true;
    }
    
}
