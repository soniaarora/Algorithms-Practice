/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

/**
 *
 * @author Hp
 */
public class Cell {
    
    public int val;
    public int curr_row;
    public int next;
    
    Cell(int val, int row,int next)
    {
        this.val = val;
        this.curr_row = row;
        this.next = next;
    }
    
}
