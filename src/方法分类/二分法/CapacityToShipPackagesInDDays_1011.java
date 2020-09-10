package 方法分类.二分法;

public class CapacityToShipPackagesInDDays_1011 {
    class Solution {
        public int shipWithinDays(int[] weights, int D) {
            int lo = 0, hi = Integer.MAX_VALUE;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (canShip(weights, D, mid)) {
                    hi = mid;
                } else {
                    lo = mid+1;
                }
            }
            return lo;
        }
        private boolean canShip(int[] weights, int D, int K) {
            int cur = K; // cur 表示当前船的可用承载量
            for (int weight: weights) {
                if (weight > K) return false;
                if (cur < weight) {
                    cur = K;
                    D--;
                }
                cur -= weight;
            }
            return D > 0; // 能否在D天内运完
        }
    }


}
