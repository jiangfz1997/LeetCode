package Array;

import java.util.Arrays;

public class Sum3Closest_0016 {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length && min != 0; i++){
            int low = i+1, high = nums.length-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(Math.abs(target - sum) <Math.abs(min) ) min = target - sum;
                if(sum > target) high--;
                else low++;
            }
        }
        return target - min;
    }
}
