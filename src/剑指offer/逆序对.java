package 剑指offer;

public class 逆序对 {
    private int count;
    public int InversePairs(int [] array) {
        mergeSort(array, 0, array.length-1);
        return count;
    }
    private void mergeSort(int[] array, int start, int end){
        if(start >= end) return;
        int mid = (start + end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid+1, end);
        mergeOne(array, start, mid, end);
    }
    private void mergeOne(int[] array, int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        int i = start, j = mid+1;
        int k = 0;
        while(i < mid+1 && j < end+1){
            if(array[i] > array[j]){
                temp[k++] = array[j++];
                count += (mid-i+1);
                count = count%1000000007;
            }else{
                temp[k++] = array[i++];
            }
        }
        while(i < mid+1) temp[k++] = array[i++];
        while(j < end+1) temp[k++] = array[j++];
        for(int l = 0; l < k; l++){
            array[start+l] = temp[l];
        }
    }
}
