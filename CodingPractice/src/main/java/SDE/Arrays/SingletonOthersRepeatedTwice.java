package SDE.Arrays;

public class SingletonOthersRepeatedTwice {


    public static void main(String args[]){

        int[] result = findRepeated(new int[]{2,4,2,3,4,1});
        System.out.println(result[0] + " " +result[1]);
    }


    public static int[] findRepeated(int[] arr) {

        if (arr == null || arr.length == 0) {

            return null;
        }
        int xorResult = 0;
        for (int i = 0; i < arr.length; i++) {

            xorResult ^= arr[i];

        }

        int mask = 1;
        for (int i = 0; i < 32; i++) {

            if ((xorResult & mask) != 0) {
                break;
            }
            mask = mask << 1;
        }

        int unset = 0;
        int set = 0;

        for (int j = 0; j < arr.length; j++) {

            if ((mask & arr[j]) == mask) {

                set ^= arr[j];
            } else {

                unset ^= arr[j];
            }
        }

        return new int[] {set,unset};
    }
}
