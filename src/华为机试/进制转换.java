package 华为机试;

import java.util.Scanner;

public class 进制转换 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String tmp = in.nextLine();
            String s = tmp.substring(2, tmp.length());
            System.out.println(process(s));
        }

    }
    public static String process(String s){
        int length = s.length();
        int sum = 0;
        for(int i = length-1; i >= 0; i--){
            char c = s.charAt(i);
            int a = (length-1-i);
            if(c <= 57 || c >= 48)
                sum += Math.pow(16, a)*(c-'0');
            else
                sum += Math.pow(16, a)*(c-'A'+10);
        }
        String result = String.valueOf(sum);
        return result;
    }
}
