package Array;

public class ProductOfArrayExceptSelf_0238 {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return null;
        int[] result = new int[nums.length];
        int right = 1;
        result[0] = 1;

        for(int i = 1; i < nums.length; i++){
            result[i] = nums[i-1]*result[i-1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            right = right * nums[i+1];
            result[i] = right * result[i];
        }

        return result;
    }
}
