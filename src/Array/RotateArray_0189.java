package Array;
/*
 * Still need to think about the in-place problem

 * How to fix:Could use the extra memory.

 * Complexity: O(n)
 * What's new: Not for now.
 * What reminds fixed: Non for now
 * */
public class RotateArray_0189 {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int[] result = new int[l];
        int i = 0;
        int z= k%l;
        k = k%l;
        for(;i < z ; i++){
            result[i] = nums[l-k];
            k--;

        }
        for(;i < l ; i++){
            result[i] = nums[k];
            k++;

        }
        for(int j = 0; j < l; j++){
            nums[j] = result[j];
        }

    }
}
