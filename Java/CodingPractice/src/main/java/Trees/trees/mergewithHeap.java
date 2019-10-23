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
public class mergewithHeap

{
    
    public MergeHeapNode[] harr;
//    public MergeHeapNode root;
   public  int heapsize = 0;
    public static void main(String arg[])
    {
        int[][] arr = {{6,9,10},{3,4,5},{1,2,3}};
        mergewithHeap mer = new mergewithHeap();
        
        int k = arr.length;
        int n= arr[0].length;
        
        mer.mergeKbyN(arr, k, n);
    }
    public MergeHeapNode mergeKbyN(int[][] arr, int k, int n)
    {
        
        MergeHeapNode[] temp = new MergeHeapNode[k*n];
        
        MergeHeapNode[] root = new MergeHeapNode[k];
        for(int i = 0; i< k; i++)
        {
            root[i].data = arr[i][0];
            root[i].i = i;
            root[i].j = 1;
        }
        mergewithHeap m = new mergewithHeap();
        //m.buildHeap(arr);
        return null;
    }
}
