package String;

public class LongestPalindromicSubstring_0005 {
    public String longestPalindrome(String s) {
        int l = s.length();
        int maxLength = 0;
        int start = 0;
        boolean[][] track = new boolean[l][l];
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j <= i; j++){
                if(i == j) track[i][j] = true;
                else if(i - j == 1) track[j][i] = s.charAt(i) == s.charAt(j);
                else{
                    track[j][i] = track[j+1][i-1] && (s.charAt(j) == s.charAt(i));
                }
                if(track[j][i] && i-j+1 > maxLength) {
                    start = j;
                    maxLength = i-j+1;
                }
            }

        }
        return s.substring(start, start + maxLength);

    }
}
