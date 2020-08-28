package Array;

public class TicTacToe_0348 {
    class TicTacToe {

        /** Initialize your data structure here. */
        int[][] matrix;
        int n;
        int[] row;
        int[] col;
        int[] cross;
        public TicTacToe(int n) {
            this.matrix = new int[n][n];
            this.n = n;
            this.row = new int[n];
            this.col = new int[n];
            this.cross = new int[2];
        }

        /** Player {player} makes a move at ({row}, {col}).
         @param row The row of the board.
         @param col The column of the board.
         @param player The player, can be either 1 or 2.
         @return The current winning condition, can be either:
         0: No one wins.
         1: Player 1 wins.
         2: Player 2 wins. */
        public int move(int row, int col, int player) {
            int p = player == 1 ? 1 : -1;
            this.row[row] += p;
            this.col[col] += p;
            if(row == col) this.cross[0] += p;
            if(row + col == n-1) this.cross[1] += p;

            if(this.row[row] == n || this.col[col] == n || this.cross[0] == n || this.cross[1] == n) return 1;
            if(this.row[row] == -n || this.col[col] == -n || this.cross[0] == -n || this.cross[1] == -n) return 2;
            return 0;
        }

    }
}
