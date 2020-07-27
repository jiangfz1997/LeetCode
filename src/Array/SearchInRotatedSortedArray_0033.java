package Array;

import java.util.Scanner;

public class SearchInRotatedSortedArray_0033 {
    /*public int search(int[] nums, int target) {
        int start = 0;
        int end  = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] >= nums[start]){
                if(target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid+1;
            }else{
                if(target <= nums[end] && target > nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }*/
    public int search(int[] nums, int target) {
        int l = nums.length;
        return bSearch(nums, target, 0, l-1);
    }
    private int bSearch(int[] nums, int target, int start, int end){
        if(start == end && nums[start] != target) return -1;
        int middle = (start+end)/2;
        if(target == nums[middle]) return middle;
        if(target > nums[middle] && nums[middle] > nums[end]) return bSearch(nums, target, middle+1, end);
        if(target > nums[middle] && nums[middle] <= nums[end]) return bSearch(nums, target, start, middle-1);
        if(target < nums[middle] && nums[middle] > nums[end]) return bSearch(nums, target, middle+1, end);
        if(target < nums[middle] && nums[middle] <= nums[end]) return bSearch(nums, target, start, middle-1);
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray_0033 s  = new SearchInRotatedSortedArray_0033();
        Scanner a = new Scanner(System.in);
        String tmp = a.nextLine();
        String[] tmpArr = tmp.split(" ");
        for (String sb: tmpArr) {
            System.out.println(sb);
        }
        int[] arr = new int[tmpArr.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(tmpArr[i]);
            System.out.println(arr[i]);
        }
        System.out.println(s.search(arr, 0));
    }
}
