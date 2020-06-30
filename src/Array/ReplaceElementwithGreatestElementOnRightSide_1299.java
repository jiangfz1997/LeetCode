package Array;

public class ReplaceElementwithGreatestElementOnRightSide_1299 {
    //Brute force
    public int[] replaceElements(int[] arr) {
        int arrLength = arr.length;
        for(int i = 0; i < arrLength; i++){
            int max = Integer.MIN_VALUE;
            if(i == arrLength-1){
                arr[i] = -1;
                break;
            }
            for(int j = i+1; j < arrLength; j++){
                if(arr[j] > max) max = arr[j];
            }
            arr[i] = arr[i] > max ? arr[i] : max;
        }

        return arr;
    }
    //Track from the back
    public int[] replaceElementsBack(int[] arr) {
        int arrLength = arr.length;
        for(int i = 0; i < arrLength; i++){
            int max = Integer.MIN_VALUE;
            if(i == arrLength-1){
                arr[i] = -1;
                break;
            }
            for(int j = i+1; j < arrLength; j++){
                if(arr[j] > max) max = arr[j];
            }
            arr[i] = arr[i] > max ? arr[i] : max;
        }

        return arr;
    }
    public static void main(String[] args){
        int a = 0 % 2;
    }

}
