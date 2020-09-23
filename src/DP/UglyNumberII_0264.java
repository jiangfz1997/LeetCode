package DP;

public class UglyNumberII_0264 {
    class Solution {
        public class UglyNum{
            int[] cache = new int[1690];

            public UglyNum(){
                this.cache[0] = 1;
                int i1 = 0, i2 = 0, i3 = 0;
                for(int i = 1; i < 1690; i++){
                    int l = Math.min(cache[i1]*2, Math.min(cache[i2]*3, cache[i3]*5));
                    cache[i] = l;
                    if(l == cache[i1]*2) i1++;
                    if(l == cache[i2]*3) i2++;
                    if(l == cache[i3]*5) i3++;
                }
            }
            public int get(int n){
                return cache[n];
            }
        }
        public int nthUglyNumber(int n) {

            UglyNum u = new UglyNum();
            return u.get(n-1);
        }
    }
}
