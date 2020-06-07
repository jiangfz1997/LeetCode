package DP;

public class HouseRobber_0198 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];


        int result = 0;
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0) {
                dp[i] = nums[0];
            }
            else if(i == 1) {
                dp[i] = nums[1];
            }else{
                maxSum = Math.max(dp[i-2], maxSum);
                dp[i] = Math.max(maxSum + nums[i], nums[i]);
            }

            result = Math.max(dp[i], result);
        }
        return result;
    }
    public static void main(String args[]){
        HouseRobber_0198 h = new HouseRobber_0198();
        int[] array = {9,5,7,8,9,10};
        System.out.println(h.rob(array));
    }
}
