package String;

import java.util.Arrays;

public class CheckAStringCanBreakAnotherString_1433 {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return check(a, b, a.length-1) || check(b, a, a.length-1);
    }
    public boolean check(char[] a, char[] b, int pivot){
        if(pivot == -1)
            return true;
        if(a[pivot] < b[pivot])
            return false;
        return check(a, b, pivot-1);
    }
}
