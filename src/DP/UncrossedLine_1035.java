package DP;

public class UncrossedLine_1035 {
    /*
     *
     * How to fix: Dynamic Programming
     * Complexity: O(n2)
     * What's new: Learned that Map.getOrDefault() is quite useful;
     * What reminds fixed: Non for now
     * */


        public static int maxUncrossedLines(int[] A, int[] B) {
            int aLength = A.length;
            int bLength = B.length;
            int dp[][] = new int[aLength+1][bLength+1];

            for(int i = 0; i <= bLength; i++){
                dp[0][i] = 0;
            }
            for(int i= 0; i <= aLength; i++){
                dp[i][0] = 0;
            }

            for(int i = 1; i <= aLength; i++){
                for(int j = 1; j <= bLength; j++){
                    if(A[i-1] == B[j-1]){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }else{
                        dp[i][j] = Math.max(Math.max(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]);
                    }
                }
            }
            return dp[aLength][bLength];

        }

        public static void main(String[] args){
            int[] a = {1,2,4};
            int[] b = {1,4,2};
            int m = UncrossedLine_1035.maxUncrossedLines(a,b);
            System.out.println(m);

        }

}
