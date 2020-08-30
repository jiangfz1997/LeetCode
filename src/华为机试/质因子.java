package 华为机试;

import java.util.ArrayList;
import java.util.Scanner;

public class 质因子 {
    public static ArrayList<Long> helper(long l){
        ArrayList<Long> list = new ArrayList<>();
        for(long i = 2; i < l; i++){
            while(l != i){
                if(l % i != 0){
                    break;
                }
                list.add(i);
                l /= i;
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long l = in.nextLong();
            ArrayList<Long> list = helper(l);
            for(long i : list){
                System.out.print(i + " ");
            }
        }
    }
}
