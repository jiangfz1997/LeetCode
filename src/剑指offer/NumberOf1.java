package 剑指offer;

import java.util.ArrayList;
import java.util.Queue;

public class NumberOf1 {
    public static int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            int c = n & 1;
            if(c == 1) count++;
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOf1(14);

    }
}
