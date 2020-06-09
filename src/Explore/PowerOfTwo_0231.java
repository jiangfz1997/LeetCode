package Explore;

public class PowerOfTwo_0231 {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        String s = Integer.toBinaryString(n);
        int i = 1<<(s.length()-1);
        int k = i^n;
        return (int)(i^n) == 0?true:false;
    }
    public static void main(String args[]){
        PowerOfTwo_0231 p = new PowerOfTwo_0231();
        System.out.println(p.isPowerOfTwo(1));
    }
}
