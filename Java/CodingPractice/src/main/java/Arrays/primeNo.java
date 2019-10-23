/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class primeNo {
    
    public static void main(String[] arg){
        
        System.out.print(countPrime(20));
    }
    public static  int countPrime(int n){
	int count = 0;
        for(int i = 1; i < n; i++){
            if(isPrime(i)){
                    count++;
            }	

          }

        return count;
        }

        public static boolean isPrime(int n){

                if(n == 0 || n==1){
                return false;
                }   

                for(int i = 2; i < n ; i++){

                if(n%i == 0){
                    return false;
                }
            } 
            return true;
        }

}
