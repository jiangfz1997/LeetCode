package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum_0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length-3; i++){
            if(nums[i] > target) return result;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < length-2; j++){
                if(nums[i] + nums[j] > target) return result;
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int start = j+1, end = length-1;
                while(start < end){
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if(sum == target) {
                        List<Integer> tmp =Arrays.asList(nums[i], nums[j], nums[start], nums[end]);
                        if (!result.contains(tmp)) {
                            result.add(tmp);
                        }
                        while(start < end && nums[start+1] == nums[start]) start++;
                        while(start < end && nums[end-1] == nums[end]) end--;
                        start++;
                        end--;
                    }else if(sum > target){
                        end--;
                    }else{
                        start++;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        fourSum_0018 f = new fourSum_0018();
        int[] a = {1,-2,-5,-4,-3,3,3,5};
        f.fourSum(a, -11);
    }
}
