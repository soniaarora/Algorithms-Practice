public class minSizeSubArray {


    public static  void main(String arg[]){

        int[] arr = {2,3,1,4};

        System.out.println(minSize(arr,6));
    }

    public static int minSize(int[] arr, int target){


        if(arr.length == 0){

            return 0;
        }

        int i = 0, j = 0, min = Integer.MAX_VALUE;

        int sum = 0;

        while(i < arr.length){

            sum += arr[i];

            while(sum >= target){

                min = Math.min(min, i - j +1);
                sum -= arr[j];
                j++;
            }
            i++;
        }

        return min == Integer.MAX_VALUE ? Integer.MAX_VALUE: min;
    }
}