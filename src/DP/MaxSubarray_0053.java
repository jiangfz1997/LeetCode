package DP;

public class MaxSubarray_0053 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int maxSum = nums[0];
            for(int i = 1; i < n; i++){
                if(nums[i-1] > 0) nums[i] = nums[i-1] + nums[i];

                maxSum = Math.max(nums[i], maxSum);
            }
            return maxSum;
        }
    }
}
