package Array;

import java.util.Scanner;

public class FindFirstLastElementInSortedArray_0034 {
    public int[] searchRange(int[] nums, int target) {
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
            else end = mid-1;
        }
        int[] a = {-1, -1};
        if( head == nums.length ||nums[head] != target ) return a;
        a[0]= head;
        a[1] = end;

        return a;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] sArr = s.split(" ");
        int[] a = new int[sArr.length];
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(sArr[i]);
            System.out.println(a[i]);
        }
        FindFirstLastElementInSortedArray_0034 f = new FindFirstLastElementInSortedArray_0034();
       int[] m = f.searchRange(a, 1);
        for (int tmp:m) {
            System.out.println(tmp);
        }
    }
}
