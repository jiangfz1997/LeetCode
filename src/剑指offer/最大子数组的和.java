package 剑指offer;

public class 最大子数组的和 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1] > 0 ? array[i - 1] : 0;
            max = Math.max(max, array[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {6,-2,-3,7,8,9,-1,2};
        FindGreatestSumOfSubArray(a);
    }
}
