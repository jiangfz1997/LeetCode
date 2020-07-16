package Array;

public class KthLargestElement_0215 {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        // 转换一下，第 k 大元素的索引是 len - k
        int target = len - k;


        while (true) {
            int index = partition(nums, left, right);
            if (index == target) {
                return nums[index];
            } else if (index < target) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }



    }

    private int partition(int[] array, int start, int end){
        if(start >= end) return start;
        int i = start;
        int j = end;
        int tmp = array[start];
        while(i < j){
            while(i < j && array[j] > tmp ){
                j--;
            }
            while(i < j && array[i] <= tmp){
                i++;
            }
            if(i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        array[start] = array[i];
        array[i] = tmp;
        return i;
    }


    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
