package 华为机试;
import java.util.*;
public class 学生信息 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int stuNum = in.nextInt();
            int opNum = in.nextInt();
            int[] score = new int[stuNum];
            for(int i = 0; i < stuNum; i++){
                score[i] = in.nextInt();
            }
            for(int i = 0; i < opNum; i++){
                char c = in.next().charAt(0);
                int a = in.nextInt();
                int b= in.nextInt();
                if(c =='Q'){
                    int m = search(score, a, b);
                    System.out.println(m);
                }

                if(c == 'U')
                    score = update(score, a, b);
            }
        }
    }
    public static int search(int[] score, int from, int to){
        int max = Integer.MIN_VALUE;
        if(from > to){
            int tmp = to;
            to = from;
            from = tmp;
        }
        for(int i = from-1; i <= to-1; i++){
            if(max < score[i]) max = score[i];
        }
        return max;
    }
    public static int[] update(int[] score, int stu, int newS){

        score[stu-1] = newS;
        return score;
    }
}
