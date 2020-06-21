package AlgorithmReview;

public class KMP {
    private int[][] dp;  // dp数组用于保存状态机，每一行代表一个状态
    private String pat;
    public KMP(String s){
        this.pat = s;
        int length = s.length();
        this.dp = new int[length][256];
        dp[0][pat.charAt(0)] = 1;
        int X = 0; // X 是一个坐标用于标记，0-X和0-j拥有相同公共前缀
        for(int j = 1; j < length; j++){
            for(int k = 0; k < 256; k++)
                dp[j][k] = dp[X][k];
            dp[j][pat.charAt(j)] = j+1;
            X = dp[X][pat.charAt(j)];
        }
    }

    public int search(String txt){
        int pLength = pat.length();
        int tLength = txt.length();
        int j = 0;
        for(int i = 0; i < pLength; i++){
            j = dp[j][txt.charAt(i)];  // j = 下个状态机
            if(j == tLength) return i - tLength + 1;  //当j达到最后一个状态机则说明有前缀
        }
        return -1;
    }
}
