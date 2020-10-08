package AlgorithmReview;

public class insertSort {
    public static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int val = arr[i];
            int post = i;
            while(post > 0 && arr[post-1] > val){
                arr[post] = arr[post-1];
                post--;
            }
            arr[post] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,8,76};
        insertSort(arr);
        for(int i : arr)
            System.out.println(i);
    }
}
