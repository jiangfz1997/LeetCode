package 华为机试;
import java.util.*;
public class 分组的和相等 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num = in.nextInt();
            List<Integer> list = new ArrayList<>();
            int five = 0;
            int three = 0;
            for(int i = 0; i < num; i++){
                int tmp = in.nextInt();
                if(tmp%5 == 0) five += tmp;
                else if(tmp%3==0) three += tmp;
                else list.add(tmp);
            }
            System.out.println(test(five, three, list));
        }
    }
    public static boolean test(int a, int b, List<Integer> list){

        if(list.size() == 1 ){
            if( a + list.get(0) == b || b + list.get(0) == a)
                return true;
            else
                return false;
        }

        return test(a+list.get(0), b, list.subList(1, list.size()))&&test(a, b+list.get(0), list.subList(1, list.size()));
    }
}
