package String;

import java.util.*;

public class CustomSortString_0791 {
    static int[] rule = new int[26];
    public String customSortString(String S, String T) {
        for(int i = 0; i < S.length(); i++){
            rule[S.charAt(i) - 'a'] = i;
        }
        List<Obj> list = new ArrayList<>();
        for(int i = 0; i < T.length(); i++){
            list.add(new Obj(T.charAt(i)));
        }
        Collections.sort(list);
        StringBuffer sb = new StringBuffer();
        for(Obj j : list){
            sb.append(j.o);
        }
        return sb.toString();
    }
    class Obj implements Comparable {

        public char o;
        public Obj(char o){
            this.o = o;
        }



        @Override
        public int compareTo(Object o1) {
            Obj tmp = (Obj) o1;
            return rule[o-'a'] - rule[tmp.o - 'a'];
        }
    }

    public static void main(String[] args) {
        CustomSortString_0791 c  = new CustomSortString_0791();
        System.out.println(c.customSortString("cba", "abcd"));
    }
}
