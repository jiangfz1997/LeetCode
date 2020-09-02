package 华为机试;

import java.util.Scanner;

public class key_value {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            char op = in.next().charAt(0);
            char keyOp = in.next().charAt(0);

            String[] keyArray = in.next().split(String.valueOf(op));
            for(int i = 0; i < keyArray.length; i++){
                String[] result = keyArray[i].split(String.valueOf(keyOp));
                System.out.println(result[0] + " " + result[1]);
            }
        }
    }
}
