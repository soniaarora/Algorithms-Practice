package Arrays.array;

import java.util.HashMap;

//https://leetcode.com/problems/subarray-sum-equals-k/

public class SubArraySumEqualsK {

    public static void main(String arg[]){
        int[] arr = {1,2,4,8,-8,8,-8,1};
        System.out.println(subarraySum(arr,8));
    }

        public static int subarraySum(int[] nums, int k) {
            int count = 0, sum = 0;
            HashMap< Integer, Integer > map = new HashMap < > ();
            map.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (map.containsKey(sum - k))
                    count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }

}
