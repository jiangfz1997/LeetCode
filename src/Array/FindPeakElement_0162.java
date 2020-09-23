package Array;

public class FindPeakElement_0162 {
    public int findPeakElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){

            int right = (i == nums.length-1) ? Integer.MIN_VALUE : nums[i+1];
            if( nums[i] > right)
                return i;
        }
        return 0;
    }
}
