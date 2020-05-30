package Array;

public class SingleNumber_0136 {

   /*此题使用按位异或，当a与b相同时异或结果为0，a与0异或也为0，因此可以通过二进制异或来解决*/
    public int singleNumber(int[] nums) {
        int a=0;
        for(int i : nums){
            a ^=i;
        }
        return a;}
}
