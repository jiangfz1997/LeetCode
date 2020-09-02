package 华为机试;

import java.util.Scanner;

public class 编辑距离 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            int[][] dp = new int[s1.length()+1][s2.length()+1];
            for(int i = 0; i < s1.length()+1; i++){
                dp[i][0] = i;
            }
            for(int j = 0; j < s2.length()+1; j++){
                dp[0][j] = j;
            }
            char c = 'c';
            String s = String.valueOf(c);
            System.out.println(s);
            for(int i = 1; i < s1.length(); i++){
                for(int j = 1; j < s2.length(); j++){
                    if(s1.charAt(i-1) == s2.charAt(j-1))
                        dp[i][j] = dp[i-1][j-1];
                    else
                        dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]))+1;

                }
            }
            System.out.println(dp[s1.length()][s2.length()]);
        }
    }
}
