/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hp
 */
public class mergeKbyNLists 
{
    public static void main(String arg[])
    {
        List<List<Integer>> list = new ArrayList();
        List<Integer> temp;
        temp = new ArrayList();
        temp.add(1);
        temp.add(5);
        temp.add(9);
        list.add(temp);
        List<Integer> temp1;
        temp1 = new ArrayList();
        temp1.add(3);
        temp1.add(6);
        temp1.add(10);
        list.add(temp1);
        List<Integer> temp2;
        temp2 = new ArrayList();
        temp2.add(7);
        temp2.add(11);
        temp2.add(20);
        list.add(temp2);
        
        List<Integer> result = mergeKbyN(list);
        for(int i = 0;i < result.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
        
    }
    
    public static List<Integer> mergeKbyN(List<List<Integer>> list)
    {
        List<Integer> result = new ArrayList();
        List<Cell> initialize_list = initialize(list);
        int list_size = getListsize(list);
        
        for(int i= 0 ; i < list_size ; i++)
        {
            Collections.sort(initialize_list, new Sort());
            
            Cell cell = initialize_list.get(0);
            result.add(cell.val);
//            System.out.println(cell.val);
            initialize_list.remove(0);
            System.out.print(cell.next);
            if(cell.next < list.get(cell.curr_row).size())
            {
                initialize_list.add(new Cell(list.get(cell.curr_row).get(cell.next +1),cell.curr_row, cell.next+1));
               
            }
            
        }
        
        return result;
    }
    
    public static int getListsize(List<List<Integer>> list)
    {
        int count = 0;
        
        for(int i = 0; i < list.size() ; i++)
        {
            count += list.get(i).size();
        }
    
        return count;
    }
    
    public static List<Cell> initialize(List<List<Integer>> list)
    {
        List<Cell> temp = new ArrayList();
        
        for(int i = 0; i< list.size(); i++)
        {
            List<Integer> val = list.get(i);
            if(val.size() > 0)
            {
                temp.add(new Cell(val.get(0),i,0));
            }
        }
        
        return temp;
    }
    
}

class Sort implements Comparator<Cell>
{
    @Override
    public int compare(Cell a, Cell b)
    {
        return a.val - b.val;
    }
}
