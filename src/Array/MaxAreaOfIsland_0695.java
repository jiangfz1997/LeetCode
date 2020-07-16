package Array;

public class MaxAreaOfIsland_0695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length < 1 || grid[0].length < 1) {
            return 0;
        }
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                max = Math.max(max, deepS(grid,i,j));
            }
        }
        return max;
    }
    public int deepS(int[][] nums, int i, int j){
        if(i >=0 && i <nums.length && j >=0 && j < nums[0].length && nums[i][j] == 1 ){
            nums[i][j] = 0;
            return 1+deepS(nums, i+1,j)+deepS(nums, i, j+1) + deepS(nums, i-1, j) + deepS(nums, i, j-1);
        }else{
            return 0;
        }
    }
}
