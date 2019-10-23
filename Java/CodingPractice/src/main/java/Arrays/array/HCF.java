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
public class HCF {
    
    
    public static void main(String arg[]){
        
        int a = 1000, b=10000;
        int[] arr = {20,4,32};
//        int result = findHCF(a, b);
//       int hcf = arr[0];
       
       int result = arr[0];
//       for(int i = 1; i < arr.length ; i++){
//           
//            result = findHCF(arr[i], result);
//       }
////        
            int i = 1;
            while(i < arr.length){
                
                if(arr[i]%result == 0){
                    
                    i++;
                }
                else{
                    result = arr[i] % result;
                    i++;
                }
            }


        System.out.print(result);
    }
    
    public static int findHCF(int a, int b){
//        
      while(b%a !=0){
         
          int temp = a;
          a = b%a;
          b =  temp;
          
         
      }
       return a;
    }
    
    public static int findHCf(int a, int b){
        
        if(a== 0){
            
            return b;
        }
        
        return findHCf(b%a, a);
    }
       
        
        

//int result = input2[0];
//      int i = 1;
//      while(i<input1)
//      {
//        if(input2[i]%result==0)
//        {
//            i++;
//        } else {
//            result = input2[i]%result;
//            i++;
//        }
//      }
//     
//      return result;
//
//    }
//    
    
}

