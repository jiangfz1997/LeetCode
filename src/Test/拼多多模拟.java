package Test;

import java.util.Scanner;

public class 拼多多模拟 {
    public static void main(String[] args){

        System.out.println("efer");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        while(in.hasNextLine()){

            int a = in.nextInt();
            System.out.println(a);
            int count = 0;
            while(a != 0){
                if(a == 1){

                    break;
                }
                a = a%2 == 0? a/2 : a/2+1;
                count++;
            }
            System.out.println(count);
        }
    }
}
