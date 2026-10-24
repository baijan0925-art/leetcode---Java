
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap <Integer, Integer> map = new HashMap<>();

        int[] nums = {3, 4, 5, 6};
        int target = 7;
        int difference = 0;
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];

            if (map.containsKey(difference)) {
                result[0] = i;
                result[1] = map.get(difference);
            }

            map.put(nums[i], i);
        }
        System.out.println(result);
    }
}
// loop target - num[i] = 7 - 3

// if map has differ, then return 