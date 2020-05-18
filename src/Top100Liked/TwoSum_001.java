package Top100Liked;

import java.util.HashMap;

/*
* Definitely the question I've done the most time.
* How to fix: Use HashMap to record all the number
* Complexity: O(n)
* What's new: Learned How to use HashMap
* What reminds fixed: Differences between Hash HashSet and HashMap
*
* */
public class TwoSum_001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = {0,0};
        for(int i = 0; i <= nums.length; i++){
            if(map.get(target-nums[i]) != null){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }

}
