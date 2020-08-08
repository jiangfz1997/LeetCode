package AlgorithmReview;

public class BinarySearchCloest {
    public static void main(String[] args) {
        int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(16, a));
        StringBuffer sb = new StringBuffer();

    }
    public static boolean Find(int target, int [][] array) {
        int i = binarySearchR(array, target);
        return binarySearchC(array, target, i);
    }
    public static int binarySearchR(int[][] array, int target){
        int i = 0, j = array.length-1;
        while(i < j){
            int middle = (i + j)/2;
            if(array[middle][0] == target){
                i=middle;
                break;
            }
            else{
                if(array[middle][0] > target) j = middle-1;
                else i = middle+1;
            }

        }
        if(target < array[i][0]) i--;
        return i;
    }
    public static boolean binarySearchC(int[][] array, int target, int rowNum){
        boolean flag = false;
        for(int i = rowNum; i >= 0 && !flag; i--){
            int start = 0, end = array[0].length;
            while(start <= end){
                int mid = (start + end)/2;
                if(array[i][mid] == target){
                    flag = true;
                    break;
                }else if(array[i][mid] < target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return flag;
    }
}
