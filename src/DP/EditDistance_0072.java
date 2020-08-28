package DP;

public class EditDistance_0072 {
    public int minDistance(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if(length1*length2==0) return length1+length2;
        int[][] dp = new int[length1+1][length2+1];
        for(int i = 0; i < length1+1; i++){
            dp[i][0] = i;
        }
        for(int j = 0; j < length2+1; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i < length1+1; i++){
            for(int j = 1; j < length2+1; j++){
                int insert = 1 + dp[i][j-1];
                int delete = 1 + dp[i-1][j];
                int replace = 1 + dp[i-1][j-1];
                if(word1.charAt(i-1) == word2.charAt(j-1)) replace--;
                dp[i][j] = Math.min(insert, Math.min(delete, replace));
            }
        }
        return dp[length1][length2];
    }

    public static void main(String[] args) {
        EditDistance_0072 e = new EditDistance_0072();
        e.minDistance("a", "b");
    }
}
