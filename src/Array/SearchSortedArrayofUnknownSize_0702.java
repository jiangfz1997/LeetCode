package Array;

public class SearchSortedArrayofUnknownSize_0702 {
    class ArrayReader{
        public int get(int a){

            return a;
        }
    }
    public int search(ArrayReader reader, int target) {
        if(reader.get(0) == target) return 0;
        int left = 0, right = 1;
        while(reader.get(right) <= target){
            if(reader.get(right) == target) return right;
            left = right;
            right *= 10;
        }
        while(left <= right){
            int middle = (left + right)/2;
            if(reader.get(middle) == target) return middle;
            else if(reader.get(middle) > target){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return -1;
    }
}
