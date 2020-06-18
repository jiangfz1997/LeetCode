package Array;

public class SurroundedRegion_0130 {
    class Solution {
        public void solve(char[][] board) {
            if(board.length == 0) return;
            int row = board.length;
            int column = board[0].length;

            if(row <=2 || column <= 2) return ;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    // 从边缘o开始搜索
                    boolean isEdge = i == 0 || j == 0 || i == row - 1 || j == column - 1;
                    if (isEdge && board[i][j] == 'O') {
                        dfs(board, i, j);
                    }
                }
            }


            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    if(board[i][j] == 'O') board[i][j] = 'X';
                    else if(board[i][j] == '!') board[i][j] = 'O';
                }
            }

        }
        public void dfs(char[][] board, int i, int j){
            if(i < 0 || j < 0 || i > board.length-1 || j > board[0].length-1 || board[i][j] == 'X' || board[i][j] == '!' ) return;
            board[i][j] = '!';
            dfs(board, i-1, j);
            dfs(board, i+1, j);
            dfs(board, i, j-1);
            dfs(board, i, j+1);
        }
    }
}
