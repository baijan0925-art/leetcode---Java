import java.util.Arrays;
import java.util.HashMap;

class twosum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution"); 
    }

    public static void main(String[] args) throws Exception {
        twosum solution = new twosum();

        int[] nums = {6, 4, 5, 3};
        int target = 7;

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}


