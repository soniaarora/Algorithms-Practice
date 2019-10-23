package Arrays.array;

import java.util.HashMap;
import java.util.Map;

public class SecretDailer {
    public static void main(String arg[]){

        System.out.println(entryTime("423692", "923857614"));

    }

    public static int entryTime(String s, String keypad) {
        // Write your code here
        if(s.length() ==1) {
            return 0;
        }
        Map<Character, int[]> map = new HashMap<>();
        int index =0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                map.put(keypad.charAt(index) , new int[] {i , j} );
                index++;
            }
        }
        int seconds = 0;
        for(int k = 0 ; k < s.length() - 1; k++) {
            if(s.charAt(k) == s.charAt(k + 1)) {
                continue;
            }
            int[] arr1 = map.get(s.charAt(k));
            int[] arr2 = map.get(s.charAt(k + 1));
            seconds += sec(arr1, arr2);
        }
        return seconds;

    }
    public static int sec(int[] arr1, int[] arr2) {
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
        for(int i =0 ; i < rowNbr.length; i++) {
            if(arr1[0] + rowNbr[i] == arr2[0] && arr1[1] + colNbr[i] == arr2[1]) {
                return 1;
            }
        }
        return 2;
    }
}
