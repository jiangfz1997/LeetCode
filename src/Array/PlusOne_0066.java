package Array;
/*进位若多出一位再另行创建数组，其一定是100000组成，int数组初始化默认为0*/
public class PlusOne_0066 {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        boolean flag = false;
        do{
            if(digits[i] < 9){digits[i]++; return digits;}
            if(digits[i] == 9) digits[i--] = 0; flag = true;

        }while(flag && i>=0 );
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
