package Graph;

public class NumbersOfIsland_0200 {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int[][] visited = new int[grid.length][grid[0].length];
        int res = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    count(grid, visited, i, j);
                    res++;
                }
            }
        }
        return res;

    }
    public void count(char[][] grid, int[][] visited, int i, int j){
        if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || visited[i][j] == 1) return ;
        visited[i][j] = 1;
        count(grid, visited, i+1, j);
        count(grid, visited, i, j+1);
        count(grid, visited, i-1, j);
        count(grid, visited, i, j-1);
        //count(grid, visited, i+1, j+1);
    }

    public static void main(String[] args) {
        NumbersOfIsland_0200 n = new NumbersOfIsland_0200();
        char[][] a =  {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        System.out.println(n.numIslands(a));
    }
}
