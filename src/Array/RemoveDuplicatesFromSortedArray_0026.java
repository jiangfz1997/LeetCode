package Array;
/*
 * Almost the same as 0027.

 * How to fix: Two pivots, start from the beginning, keep moving all the different element to the front. Kind like bubble sort.
 * Complexity: O(n)
 * What's new: Learned that not all two pivots starts from the front and back.
 * What reminds fixed: Non for now
 * */
public class RemoveDuplicatesFromSortedArray_0026 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != nums[i] ){
                nums[i+1] = nums[j];
                i++;
            }
        }return i+1;
    }
}
