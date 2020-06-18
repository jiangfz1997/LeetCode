package Array;

public class HIndexII_0275 {
    public int hIndex(int[] citations) {
        int length = citations.length;
        int start = 0, end = length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(citations[mid] == length - mid) return length - mid;
            if(citations[mid] < length - mid) start = mid + 1;
            else end = mid - 1;
        }
        return length - start;
    }
}
