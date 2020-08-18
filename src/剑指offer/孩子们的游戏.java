package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;

public class 孩子们的游戏 {
    public static int LastRemaining_Solution(int n, int m) {
        if(m < 1) return -1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            queue.add(i);
        }
        while(queue.size()>1){
            int j = m % (queue.size());
            while(j > 1){
                int k = queue.poll();
                j--;
                queue.add(k);
            }
            queue.poll();

        }
        return queue.poll();
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5, 3));
    }
}
