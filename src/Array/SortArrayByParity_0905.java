package Array;

public class SortArrayByParity_0905 {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }
    public static void main(String[] args){
        SortArrayByParity_0905 s = new SortArrayByParity_0905();
        int[] a = {0,1};
        s.sortArrayByParity(a);
    }
}
