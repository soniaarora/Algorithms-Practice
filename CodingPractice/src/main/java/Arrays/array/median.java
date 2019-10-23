package Arrays.array;
import java.io.IOException;
import java.lang.*;
import java.util.*;


public class median {

    public static void main(String arg[]) {

        System.out.print(medianValue(3, new int[]{1, 4, 6}, new int[]{2, 5, 8}));

          }

          public static int medianValue(int size, int[] arr1, int[] arr2){


        int[] arr = new int[2 * size];

        for(int i = 0; i < 2 * size ; i++){

            if( i < size){
                arr[i] = arr1[i];

            }
            else{
                arr[i] = arr2[i - size];
            }
        }

        Arrays.sort(arr);

        int length = 2* size;
        int medi = (arr[length /2 -1] + arr[length/2])/2;

        return medi;
          }


    static int err() throws Exception{
        try{

            throw new IOException("..");
        }
        catch(RuntimeException e){
            throw new RuntimeException(e);
        }
        finally {
            return -1;
        }
    }
}
