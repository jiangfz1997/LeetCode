package Array;

public class SortColor_0075 {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int curr = 0;
        while(curr <= end){
            if(nums[curr] == 0) swap(nums,curr++, start++);
            else if(nums[curr] == 2) swap(nums,curr, end--);
            else curr++;

        }
    }

    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String args[]){
        SortColor_0075 s = new SortColor_0075();
        int[] nums = {2,0,2,1,1,0};
        s.sortColors(nums);
     }
}
