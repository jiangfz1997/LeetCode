package Array;

public class DuplicateZero_1089 {
    class Solution {
        public void duplicateZeros(int[] arr) {
            int count = 0; //Count the number of valid 0
            int length = arr.length-1;
            for(int i = 0; i + count <= length; i++){
                if(arr[i] == 0){
                    if(i+count == length){
                        arr[length] =0;
                        length--;
                        break;
                    }
                    count++;
                }
            }

            for(int last = length-count; last>=0 && count >0; last--){
                if(arr[last] != 0){
                    arr[last + count] = arr[last];

                }else{
                    arr[last+count] = 0;
                    count--;
                    arr[last+count] = 0;
                }
            }

        }
    }
}
