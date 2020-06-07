package AlgorithmReview;

public class bubleSort {

    public int[] bubleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
            }
        return array;
        }

        public static void main(String args[]){
            int[] test = {2,3,4,5,1,9,8,7,6};
            bubleSort bubleSort = new bubleSort();
            test = bubleSort.bubleSort(test);
            for(int i : test){
                System.out.println(i);
            }
        }
    }

