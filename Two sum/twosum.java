import java.util.Arrays;
import java.util.HashMap;

class twosum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
        
    }




    public static void main(String[] args) throws Exception {
        twosum solution = new twosum();

        int[] nums = {6, 4, 5, 3};
        int target = 7;

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}


