package Array;

public class LongestContinuousIncreaseSubstring_0674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int maxLength = 0;
        int start = 0;
        int length = 0;
        for(int i = 1; i < nums.length; i++ ){
            if(nums[i] > nums[i-1]){
                length++;
                maxLength = Math.max(maxLength, i-start+1);
            }
            else{
                start = i;
                length = 0;
            }
        }
        return maxLength == 0?1:maxLength;
    }
}
