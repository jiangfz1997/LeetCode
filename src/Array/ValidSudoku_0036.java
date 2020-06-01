package Array;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku_0036 {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashMap<Integer, Integer> [] rows = new HashMap[9];
            HashMap<Integer, Integer> [] columns = new HashMap[9];
            HashMap<Integer, Integer> [] boxes = new HashMap[9];

            for(int i = 0; i < 9; i++){
                rows[i] = new HashMap<Integer, Integer> ();
                columns[i] = new HashMap<Integer, Integer>();
                boxes[i] = new HashMap<Integer, Integer>();
            }

            for(int i = 0; i < 9 ; i++){
                for(int j = 0; j < 9; j++){
                    char num = board[i][j];
                    if(num != '.'){
                        int boxNum = (j/3)*3 + i/3;
                        int n = (int)num;
                        if (rows[i].get(n) !=null || columns[j].get(n) !=null || boxes[boxNum].get(n) !=null)
                            return false;

                        rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                        columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
                        boxes[boxNum].put(n, boxes[boxNum].getOrDefault(n, 0) + 1);
                    }


                }
            }
            return true;
        }
    }
}
