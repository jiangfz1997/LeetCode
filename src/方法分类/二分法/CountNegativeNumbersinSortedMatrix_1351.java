package 方法分类.二分法;

public class CountNegativeNumbersinSortedMatrix_1351 {
    /*public static int countNegatives(int[][] grid) {
        int up = 0, down = grid.length-1;
        while(up < down){
            int mid = (up+down)/2;
            if(grid[mid][0] >=0 )
                up = mid+1;
            else
                down = mid-1;
        }
        int count = 0;
       for(int i = 0; i <= up; i++){
            int[] tmp = grid[i];
            int left = 0;
            int right = tmp.length-1;
            while(left <= right){
                int mid = (left + right)/2;
                if(tmp[mid] >= 0)
                    left = mid+1;
                else
                    right = mid-1;
            }

                count += tmp.length-left;
        }
        return count+(grid.length-1-up)*grid[0].length;
    }*/
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] row : grid) {
            count += row.length - binSearch(row);
        }

        return count;
    }

    private static int binSearch(int[] arr) {
        int left = 0, right = arr.length - 1;
        int mid;

        while(left <= right) {
            mid = (right - left)/2 + left;

            if(arr[mid] <= -1) {
                right = mid - 1;
            }

            else left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {
        //
        // int[][] test = {{8,-2,-2,-2,-4,-5,-5},{-2,-3,-3,-4,-4,-5,-5},{-2,-5,-5,-5,-5,-5,-5},{-3,-5,-5,-5,-5,-5,-5},{-5,-5,-5,-5,-5,-5,-5},{-5,-5,-5,-5,-5,-5,-5},{-5,-5,-5,-5,-5,-5,-5},{-5,-5,-5,-5,-5,-5,-5},{-5,-5,-5,-5,-5,-5,-5}};
        int[][] test = {{3,2},{1,0}};
        CountNegativeNumbersinSortedMatrix_1351.countNegatives(test);
    }
}
