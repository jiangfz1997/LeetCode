package 方法分类.滑动窗口;

public class MaxConsecutiveOneII_1004 {
    public int longestOnes(int[] A, int K) {
        int left = 0, right = 0;
        for(; right < A.length; right++){
            if(A[right] == 0)
                K--;
            if(K < 0){
                if(A[left] == 0) K++;
                left++;
            }
        }
        return right - left;
    }
}
