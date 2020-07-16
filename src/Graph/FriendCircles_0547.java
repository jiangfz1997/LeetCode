package Graph;

public class FriendCircles_0547 {
    public int findCircleNum(int[][] M) {
        int[] temp = new int[M.length];
        int count = 0;
        for(int i = 0; i < M.length; i++){
            if(temp[i] == 0){
                count++;
                dfs(M, temp, i);
            }
        }
        return count;
    }

    public void dfs(int[][] M, int[] temp, int i){
        for(int j = 0; j < M.length; j++){
            if(temp[j] == 0 && M[i][j] == 1){
                temp[j] = 1;
                dfs(M, temp, j);
            }
        }
    }
}
