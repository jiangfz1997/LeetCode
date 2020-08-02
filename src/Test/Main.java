package Test;

import java.util.Scanner;
public class Main{
    private static class Item{
        int v;
        int p;
        int q;
        int a1;
        int a2;
        public  Item(int val, int pri, int q){
            this.v = val;
            this.p = pri;
            this.q = q;
        }
        public void setA(int a){
            this.a1 = a;
        }
        public void setB(int b){
            this.a2 = b;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int n = in.nextInt();
        Item[] items = new Item[n+1];
        for(int i = 1; i <= n ; i++){
            int v = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            items[i] = new Item(v, p, q);
            if(q > 0){
                if(items[q].a1 > 0){
                    items[q].setB(i);
                }else{
                    items[q].setA(i);
                }
            }
        }

        int[][] dp = new int[n+1][money+1];
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            int v = items[i].v;

            int v1 = items[i].a1 != 0 ? v+items[items[i].a1].v : 0;
            int v2 = items[i].a1 != 0 ? v+items[items[i].a2].v : 0;
            int v3 = v1 != 0 && v2 != 0 ? v1 + v2 -v : 0;
            int temp0 = items[i].v*items[i].p;
            int temp1 = items[i].a1 != 0 ? temp0 + items[items[i].a1].v*items[items[i].a1].p:0;
            int temp2 = items[i].a2 != 0 ? temp0 + items[items[i].a2].v*items[items[i].a2].p:0;
            int temp3 = v1!=0 && v2 != 0 ? temp1 + temp2 - temp0:0;
            for(int j = 1; j < money+1; j++){
                System.out.println(j + "Test");
                if(items[i].q != 0){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                    if(j>=v&&v!=0) dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-v]+v);
                    if(j>=v1&&v1!=0) dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v1]+temp1);
                    if(j>=v2&&v2!=0) dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v2]+temp2);
                    if(j>=v3&&v3!=0) dp[i][j] = Math.max(dp[i][j],dp[i-1][j-v3]+temp3);
                }
            }

        }
        System.out.println(dp[n][money]);

    }

}