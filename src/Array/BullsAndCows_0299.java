package Array;

import java.util.HashMap;
import java.util.Map;
/*
 *
 * How to fix: Use hashmap to fix it. Record all Cows and calculate the Bulls directly.
 * Complexity: O(2n)
 * What's new: Learned that Map.getOrDefault() is quite useful;
 * What reminds fixed: Non for now
 * */


public class BullsAndCows_0299 {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> hm = new HashMap();

        int a = 0;
        int b = 0;



        for(int i = 0; i < secret.length(); i++){
            char tmp = secret.charAt(i);
            char tmp2 = guess.charAt(i);
            if(tmp == tmp2){
                a++;
            }else{
                hm.put(tmp,hm.getOrDefault(tmp,0)+1);
            }


        }
        for(int l = 0; l < guess.length(); l++){
            char tmp = guess.charAt(l);
            char tmp2 = secret.charAt(l);
            if(tmp != tmp2 && hm.containsKey(tmp) && hm.get(tmp) -1 >=0  ){
                b++;
                hm.put(tmp, hm.get(tmp)-1);
            }
        }
        String s = a + "A" + b + "B";
        return s;
    }

    public static void main(String[] args){
        BullsAndCows_0299 b = new BullsAndCows_0299();
       System.out.println( b.getHint("1121","2211"));
    }
}
