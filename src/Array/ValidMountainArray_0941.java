package Array;

public class ValidMountainArray_0941 {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
        int end = A.length-1;
        int start = 0;
        while(start < A.length-1 && A[start] < A[start+1]) start++;
        if(start == A.length-1) return false;
        while(end >0 && A[end] < A[end-1]) end--;
        if(end == 0) return false;
        return start==end;
    }
    public static void main(String[] args){
        ValidMountainArray_0941 v = new ValidMountainArray_0941();
        int[] a = {1,3,2};
        v.validMountainArray(a);
    }
}
