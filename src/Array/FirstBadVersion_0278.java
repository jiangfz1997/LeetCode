package Array;

public class FirstBadVersion_0278 {
    public int firstBadVersion(int n) {
        int left = 1;
        while(left < n){
            int middle = left + (n - left)/2;
            //if (isBadVersion(middle)) {n = middle;}
           // else {left = middle+1;}
        }
        return left;
    }
}
