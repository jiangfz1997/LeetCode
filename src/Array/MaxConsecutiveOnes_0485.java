package Array;

public class MaxConsecutiveOnes_0485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 1) count = 0;
            else max = Math.max(++count, max);
        }
        return max;
    }
}
