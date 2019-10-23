package Arrays;

import java.util.HashMap;
import java.util.Map;

public class minJumps {


    public static void main(String arg[]){

        int[] arr = {2,1,2,1,3};



        //System.out.print(minJumps(arr));
       // System.out.println(entryTime("423692", "923857614"));

    }


    public static int minJumps(int[] arr){

        int[] dp = new int[arr.length];

        dp[0] = 0;
        for(int i = 1; i < arr.length ; i++){

            dp[i] = Integer.MAX_VALUE;

            for(int j = 0; j< i ; j++){

                if(i <= j+ arr[j] && dp[j] != Integer.MAX_VALUE){

                    dp[i] = Math.min(dp[j]+1,dp[i] );

                }
            }


        }

        return dp[arr.length - 1];

    }
}
