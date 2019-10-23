/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hp
 */
public class countandsay 
{
    public static void main(String arg[])
    {
        List<String> list = new ArrayList();
        list.add("Heelo World");
        list.add("A");
        list.add("San Francisco");
        
        Collections.sort(list,Comparator.comparing(String::length).reversed());
        
        for(String l : list)
        {
            System.out.println(l);
        }
        
        
    }
    
}
