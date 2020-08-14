package 剑指offer;

public class 一的个数 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        int digit = 1;
        int cur = n%10;
        int front = n/10;
        int behind = 0;
        while(cur != 0 || front != 0){
            if(cur == 0) count += front * digit;
            else if(cur == 1) count += front * digit + behind + 1;
            else count += (front+1) * digit;

            behind += cur * digit;
            cur = front% 10;
            front /= 10;
            digit *= 10;
        }
        return count;
    }
}
