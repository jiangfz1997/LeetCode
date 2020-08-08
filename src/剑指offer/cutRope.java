package 剑指offer;

public class cutRope {


        public static int cutRope(int target) {
            int[] dp = new int[target+1];
            if(target == 2) return 1;
            if(target == 3) return 2;

            return helper(target, dp);
        }
        public static int helper(int num, int[] dp){
            if(num < 4) return num;
            int max = 0;
            if(dp[num] != 0) return dp[num];
            else{

                for(int i = 1; i < num; i++){
                    max = Math.max(max, i * helper(num - i, dp));
                }
                dp[num] = max;
            }
            return max;

        }

    public static void main(String[] args) {
        cutRope(15);
    }

}
