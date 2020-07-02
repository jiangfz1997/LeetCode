package Array;
/*
* 本题使用二分查找法，为防止越界，改用long来保存sum结果
* */
public class ArrangingCoins_0441 {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;
    }
}
