package Array;

public class SearchInsertPosition_0035 {
    public int searchInsert(int[] A, int target) {
        return searchInsert(A, target, 0, A.length - 1);
    }

    public int searchInsert(int[] A, int target, int l, int r) {
        if (l > r) return l;
        int mid = (l + r) / 2;
        if (A[mid] == target)
            return mid;
        else if (A[mid] > target)
            return searchInsert(A, target, l, mid - 1);
        else return searchInsert(A, target, mid + 1, r);
    }
    public static void main(String args[]){
        SearchInsertPosition_0035 s = new SearchInsertPosition_0035();
        int[] h = {1,3,5,6};
        System.out.println(s.searchInsert(h,0));
    }
}
