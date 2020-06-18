package Array;

public class WordSearch_0079 {
    class Solution {
        private char[][] board;
        private int ROWS;
        private int COLS;

        public boolean exist(char[][] board, String word) {
            this.board = board;
            this.ROWS = board.length;
            this.COLS = board[0].length;
            for (int row = 0; row < this.ROWS; ++row)
                for (int col = 0; col < this.COLS; ++col)
                    if (this.backtrack(word, row, col, 0))
                        return true;
            return false;
        }

        public boolean backtrack( String word, int row, int col, int index){
            if(index >= word.length()) return true;

            if(row < 0 || row == this.ROWS || col < 0 || col == this.COLS || this.board[row][col] != word.charAt(index)) return false;
            this.board[row][col] = '#';
            boolean ret = (this.backtrack(word,row+1, col, index+1) || this.backtrack(word,row-1, col, index+1) || this.backtrack(word,row, col-1, index+1) ||                         this.backtrack(word,row, col+1, index+1));
            this.board[row][col] = word.charAt(index);
            return ret;
        }
    }
}
