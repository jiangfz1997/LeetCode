package 方法分类.回溯;

public class SudokuSolver_0037 {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        backTrack(board, 0, 0);
    }

    public boolean backTrack(char[][] board, int row, int col){
        if(col > 8)
            return backTrack(board, row+1, 0);
        if(row == 9)
            return true;
        if(board[row][col] != '.')
            return backTrack(board, row, col+1);
        for(char i = '1'; i <= '9'; i++){
            if(!isValid(board, row, col, i))
                continue;
            board[row][col] = i;

            if(backTrack(board, row, col+1))
                return true;
            board[row][col] = '.';

        }
        return false;
    }

    public boolean isValid(char[][] board, int a, int b, char ch){
        for(int i = 0; i < 9; i++){
            if(board[a][i] == ch)    return false;
            if(board[i][b] == ch)    return false;
            if(board[(a/3)*3 + i/3][(b/3)*3 + i%3] == ch) return false;
        }
        return true;
    }
}
