package AlgorithmReview;

public class quickSort {

    public static void quickSort(int[] array, int start, int end){
       if(start >= end) return;
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
        quickSort(array, start,i-1 );
        quickSort(array, i+1, end);

    }

    public static void main(String args[]){
        int[] test = {9,9,4,13,2,44,23,4,10};
        quickSort qs = new quickSort();
        qs.quickSort(test, 0, test.length-1);
        for (int i: test
             ) {
            System.out.println(i);
        }
    }
}
