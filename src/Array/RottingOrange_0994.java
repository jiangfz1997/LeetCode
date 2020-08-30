package Array;

public class RottingOrange_0994 {
    public int orangesRotting(int[][] grid) {
        boolean flag = true;
        int minTime = Integer.MIN_VALUE;
        while(flag){
            flag = routen(grid);
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1) return -1;
                minTime = Math.max(grid[i][j], minTime);
            }
        }
        return minTime == 0 ? 0 : minTime-2;
    }

    public boolean routen(int[][] grid){
        boolean flag = false;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] > 1){
                    if(i < grid.length-1 && (grid[i+1][j] == 1 || grid[i+1][j] > grid[i][j]+1)){
                        grid[i+1][j] = grid[i][j]+1;
                        // minTime = Math.min(minTime, grid[i][j]+1);
                        flag = true;
                    }
                    if(j < grid[0].length-1 && (grid[i][j+1] == 1 || grid[i][j+1] > grid[i][j]+1)){
                        grid[i][j+1] = grid[i][j]+1;
                        //  minTime = Math.min(minTime, grid[i][j]+1);
                        flag = true;
                    }
                    if(i>0 && (grid[i-1][j] == 1 || grid[i-1][j] > grid[i][j]+1)){
                        grid[i-1][j] = grid[i][j]+1;
                        //  minTime = Math.min(minTime, grid[i][j]+1);
                        flag = true;
                    }
                    if(j>0 && (grid[i][j-1] == 1 || grid[i][j-1] > grid[i][j]+1)){
                        grid[i][j-1] = grid[i][j]+1;
                        // minTime = Math.min(minTime, grid[i][j]+1);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
