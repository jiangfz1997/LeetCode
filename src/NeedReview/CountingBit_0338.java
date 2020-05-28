package NeedReview;

public class CountingBit_0338 {

    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        int i = 0, b = 1;
        // [0, b) is calculated
        while (b <= num) {
            // generate [b, 2b) or [b, num) from [0, b)
            while(i < b && i + b <= num){
                ans[i + b] = ans[i] + 1;
                ++i;
            }
            i = 0;   // reset i
            b <<= 1; // b = 2b
        }
        return ans;
    }

    public static void main(String args[]){
        CountingBit_0338 c = new CountingBit_0338();
       int[] m =  c.countBits(64);
      for(int i = 0; i < 20; i++){
          System.out.println(m[i]);
      }
    }
}
