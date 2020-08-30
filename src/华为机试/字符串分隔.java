package 华为机试;

import java.util.Scanner;

public class 字符串分隔 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            int l = s1.length();
            int length1 = s1.length()/8 + (s1.length()%8 != 0 ? 1 : 0);
            int length2 = s2.length()/8 + (s2.length()%8 != 0 ? 1 : 0);
            String[] array = new String[length1+length2];
            int pivot = 0;
            int i = 0;
            for(; i < length1; i++){
                if((pivot + 8)<s1.length()){
                    array[i] = s1.substring(pivot, pivot+8);
                    pivot += 8;
                }else{
                    array[i] = s1.substring(pivot, s1.length());
                    for(int j = s1.length()- pivot; j < 8; j++){
                        array[i] = array[i] + "0";
                    }
                }
            }
            pivot = 0;
            for(int k = 0; k < length2; k++){
                if((pivot + 8)<s2.length()){
                    array[i] = s2.substring(pivot, pivot+8);
                    i++;
                    pivot += 8;
                }else{
                    array[i] = s2.substring(pivot, s2.length());

                    for(int j = s2.length()- pivot; j < 8; j++){
                        array[i] = array[i] + "0";
                    }
                }
            }
            for(String s : array){
                System.out.println(s);
            }
        }
    }
}
