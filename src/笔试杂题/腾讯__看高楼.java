package 笔试杂题;

import java.util.LinkedList;
import java.util.Scanner;
/*
* 小Q在周末的时候和他的小伙伴来到大城市逛街，一条步行街上有很多高楼，共有n座高楼排成一行。
小Q从第一栋一直走到了最后一栋，小Q从来都没有见到这么多的楼，所以他想知道他在每栋楼的位置处能看到多少栋楼呢？（当前面的楼的高度大于等于后面的楼时，后面的楼将被挡住）
* */
public class 腾讯__看高楼 {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int n = in.nextInt();
                int[] array = new int[n];
                for(int i = 0; i < n; i++){
                    array[i] = in.nextInt();
                }
                int[] result = new int[n];
                LinkedList<Integer> stack = new LinkedList<>();
                for(int i = 0; i < n; i++){
                    if(stack.size() == 0){
                        stack.add(array[i]);
                    }else{
                        int tmp = stack.pop();
                        while(stack.size() > 0 && tmp >= stack.peek()){
                            stack.pop();
                        }
                        stack.push(tmp);
                        stack.push(array[i]);
                    }
                    result[i] += stack.size();
                }
                stack = new LinkedList<>();
                for(int i = n-1; i >= 0; i-- ){
                    if(stack.size() == 0){
                        stack.add(array[i]);
                    }else{
                        int tmp = stack.pop();
                        while(stack.size() > 0 && tmp >= stack.peek()){
                            stack.pop();
                        }
                        stack.push(tmp);
                        stack.push(array[i]);
                    }
                    result[i] += stack.size()-1;
                }
                for(int i : result){
                    System.out.println(i);
                }
            }
        }
    }


