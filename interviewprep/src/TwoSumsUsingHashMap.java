import java.util.HashMap;
import java.util.Map;

public class TwoSumsUsingHashMap {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current=nums[i];
            int need=target-current;

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(current, i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=twoSum(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
