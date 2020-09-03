package Array;

public class FindMinInRotatedSortedArray_0153 {
    public int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        int L = 0, R = nums.length-1;
        while(L < R){
            int mid = (L + R)/2;
            if(nums[mid] > nums[R])
                L = mid+1;
            else
                R = mid;
        }
        return nums[L];
    }
}
