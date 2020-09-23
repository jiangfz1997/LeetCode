package DP;

public class MaxProductSubarray_0152 {
    class Solution {
        public int maxProduct(int[] nums) {
            int max = Integer.MIN_VALUE, minT = 1, maxT = 1;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] < 0){
                    int temp = maxT;
                    maxT = minT;
                    minT = temp;
                }
                maxT = Math.max(maxT*nums[i], nums[i]);
                minT = Math.min(minT*nums[i], nums[i]);
                max = Math.max(max, maxT);
            }
            return max;
        }
    }
}
