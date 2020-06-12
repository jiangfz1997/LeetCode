package BitCalculate;

public class Adding_BitVer_0371 {
    public int getSum(int a, int b) {
        int sum;
        int carry;
        do
        {
            sum=a^b;
            carry=(a&b)<<1;
            a=sum;
            b=carry;
        }while(carry!=0);
        return sum;

    }
}
