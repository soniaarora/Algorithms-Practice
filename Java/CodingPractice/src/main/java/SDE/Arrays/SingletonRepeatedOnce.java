package SDE.Arrays;

public class SingletonRepeatedOnce {


    public static void main(String args[]){

        System.out.println(findSingleton(new int[]{2,3,4,2,3,4,1}));

    }

    public static Integer findSingleton(int[] arr){

        if(arr == null || arr.length == 0){

            return null;
        }
        int result = 0;
        for(int i = 0 ; i< arr.length ; i++){

            result ^=arr[i];
        }

        return result;
    }
}
