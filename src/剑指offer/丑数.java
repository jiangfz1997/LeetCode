package 剑指offer;

public class 丑数 {
    public static void main(String[] args) {
        GetUglyNumber_Solution(8);
    }
    public static int GetUglyNumber_Solution(int index) {

        if (index < 7) {

            return index;

        }

        int[] res = new int[index];

        res[0] = 1;

        int pos2 = 0;// 2的对列

        int pos3 = 0;// 3的对列

        int pos5 = 0;// 5的对列

        // 一个丑数*2/3/5还是丑数

        for (int i = 1; i < index; i++) {

            res[i] = Math.min(Math.min(res[pos2] * 2, res[pos3] * 3), res[pos5] * 5);

            if (res[i]==res[pos2] * 2) {

                pos2++;

            }

            if (res[i]==res[pos3] * 3) {

                pos3++;

            }

            if (res[i]==res[pos5] * 5) {

                pos5++;

            }

        }

        return res[index-1];

    }
}
