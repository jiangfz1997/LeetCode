package DP;

public class LongestIncreasingSubsequence_0300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length ==0 || nums.length == 1) return nums.length;

        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for(int i = 1; i< nums.length; i++){
            int maxVal = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j])
                    maxVal = Math.max(maxVal, dp[j]);
            }
            dp[i] = maxVal+1;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
