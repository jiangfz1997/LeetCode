package Array;

public class MountainArray_0852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right){
            int mid = (right-left)/2 + left;
            if(arr[mid]< arr[mid+1])
                left = mid+1;
            else
                right = mid;
        }
        return left;
    }
}
