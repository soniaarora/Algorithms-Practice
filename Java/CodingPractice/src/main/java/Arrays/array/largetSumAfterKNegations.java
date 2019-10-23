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
public class largetSumAfterKNegations {
    
    public static void main(String arg[]){
        
        int[] arr = {2,-3,-1,5,-4};
        
        int res = largestSumAfterKNegations(arr,2);
        System.out.print(res);
    }
    
      public static int largestSumAfterKNegations(int[] A, int K) {
        
        int maxDigit = 0;
        int minDigit = Integer.MAX_VALUE;
        int result = 0;
        
        while(K != 0){
            int index1= -1, index2 = -1;
            for(int i = 0; i< A.length ; i++){
                
                
                if(A[i] >= 0){
                    
                    if(minDigit > A[i]){
                        
                        minDigit = A[i];
                        index1 = i;
                    }
                }
                
                if(A[i] < 0){
                    
                    if(maxDigit > A[i]){
                        
                        maxDigit = A[i];
                        index2 = i;
                    }
                }
            }
            if(index2 != -1){
                
                A[index2] = -(A[index2]);
            }
            else if(index1 != -1 && index2 == -1){
                
                A[index1] = -A[index1];
            }
            
           K--;
        }
        
        for(int i = 0; i< A.length ; i++){
            
            result += A[i];
        }
        
        return result;
        
}
}