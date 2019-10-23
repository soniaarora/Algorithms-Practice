/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Hp
 */
public class reverseString {

    public static void main(String arg[]){
        
    char[] input = {'o', 'n', 'e', ' ', 't', 'w', 'o', ' ', 't', 'h', 'r', 'e', 'e',' ', 'f' ,'i', 'v', 'e'};
//        int i = 0;
//        for(int j = 0 ; j< arr.length ; j++){
//            if(arr[j] == ' '){
//                
//                reverse(arr, i, j-1);
//                i = j+1;
//            }
//            
//        }
//        
//        reverse(arr, i, arr.length - 1);
//        reverse(arr, 0, arr.length - 1);
//        
//        print(arr);
//}
//    
//    public static void print(char[] arr){
//        
//        for(int i = 0; i < arr.length ; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }

    int l = 0;
            int h = input.length - 1;

            while(l <= h)
    {
            char c = input[l];
            input[l] = input[h];
            input[h] = c;
            l++;
            h--;
    }
    int i = 0;
    for(int j= 0; j< input.length ; j++){

        if(input[j] == ' ')
        {	int i_index = i; int j_index = j - 1;
        
                while( i_index <= j_index)
                {	
                    char temp = input[i_index];
                    input[i_index] = input[j_index];
                    input[j_index] = temp;
                    i_index++;
                    j_index--;
                }

              i = j+1;   
       
        }
        if(j == input.length-1){
            while( i <= j){
                char temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
            
    
    }
    print(input);
//   

    }
 public static void print(char[] arr){
           for(int i = 0; i < arr.length ; i++)
       {
            System.out.print(arr[i] + " ");
        }
    
//    public static void reverse(char[] arr, int i , int j){
//        
//        while(i < j){
//            
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//            
//        }
//    }
    
}
}