package String;

public class StringToInteger_0008 {
    public int myAtoi(String str) {
        str = str.trim();
        char sign = '+';
        if(str.length() != 0 && (str.charAt(0) == '-' || str.charAt(0) == '+')) {
            sign = str.charAt(0);
            str = str.substring(1);
        }
        long res = 0;
        while(str.length() != 0 && Character.isDigit(str.charAt(0))) {
            res = res * 10 + str.charAt(0) - '0';
            if(res > Integer.MAX_VALUE) return sign == '+' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            str = str.substring(1);
        }
        return sign == '+' ? (int)res : (int)res * -1;
    }
}
