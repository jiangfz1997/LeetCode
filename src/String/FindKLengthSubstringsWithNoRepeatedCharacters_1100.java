package String;

import java.util.HashMap;
import java.util.Map;

public class FindKLengthSubstringsWithNoRepeatedCharacters_1100 {
    public int numKLenSubstrNoRepeats(String S, int K) {
        if(K > S.length()) return 0;
        Map<Character, Integer> map = new HashMap<>();
        boolean flag = true;
        int count = 0;

        for(int i = 0; i < K; i++){
            int k = map.getOrDefault(S.charAt(i), 0)+1;
            if(k != 1)
                flag = false;
            map.put(S.charAt(i), k);
        }
        if(flag){
            count++;
        }

        for(int i = 1; i <= S.length()-K; i++){
            int k1 = map.get(S.charAt(i-1))-1;

            if(k1 == 0)
                map.remove(S.charAt(i-1));
            else
                map.put(S.charAt(i-1), k1);
            int k2 = map.getOrDefault(S.charAt(i+K-1), 0) + 1;
            map.put(S.charAt(i+K-1), k2);
            if(k2 == 1 && map.size() == K)
                count++;
        }
        return count;
    }
}
