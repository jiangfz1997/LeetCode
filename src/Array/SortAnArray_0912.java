package Array;

public class SortAnArray_0912 {
    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length-1);
    }
    public int[] quickSort(int[] nums, int start, int end){
        if(start >= end) return nums;
        int flag = nums[start];
        int i = start;
        int j = end;
        while(i < j){
            while(i < j && nums[j] > flag ){
                j--;
            }
            while(i < j && nums[i] <= flag){
                i++;
            }
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        nums[start] = nums[i];
        nums[i] = flag;
        quickSort(nums, start, i-1);
        quickSort(nums, i+1, end);

        return nums;

    }
}
