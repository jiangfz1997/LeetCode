package 剑指offer;

public class 升序数组出现次数 {
    public static int GetNumberOfK(int [] array , int k) {
        if(array.length == 0) return 0;
        int start = 0;
        int end = array.length-1;
        while(start < end){
            int mid = (start + end)/2;
            if(array[mid] < k) start = mid +1;
            else end = mid;
        }
        int head = start;
        start = 0;
        end = array.length-1;
        while(start < end){
            int mid = (start + end)/2;
            if(array[mid] <= k) start = mid+1;
            else end = mid;
        }
        if(head == array.length || array[head] != k) return 0;

        return end - head +1;
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] < target) start = mid + 1;
            else end = mid;
        }

        int head = start;
        start = 0;
        end = nums.length;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] <= target) start = mid+1;
            else end = mid;
        }
        int[] a = {-1, -1};
        if( head == nums.length ||nums[head] != target ) return a;
        a[0]= head;
        a[1] = end-1;

        return a;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,4,5};
        System.out.println(GetNumberOfK(a, 3));
        searchRange(a, 3);
    }
}
