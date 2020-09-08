package Array;

public class RangeSumQuery_0303 {
    class NumArray {
        int[] nums;
        int[] sum;
        public NumArray(int[] nums) {

            this.nums = nums;
            sum = new int[nums.length];
            if(nums.length != 0){
                sum[0] = nums[0];
                for(int i = 1; i < nums.length; i++){
                    sum[i] = nums[i] + sum[i-1];
                }
            }

        }

        public int sumRange(int i, int j) {
            int left = i == 0 ? 0 : sum[i-1];
            return sum[j] - left;
        }
    }
}
