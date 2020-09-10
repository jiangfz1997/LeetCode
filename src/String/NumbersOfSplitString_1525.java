package String;

import java.util.HashMap;
import java.util.Map;

public class NumbersOfSplitString_1525 {
    public int numSplits(String s) {
        if(s.length() < 2) return 0;
        Map<Character, Integer> left = new HashMap<>();
        Map<Character, Integer> right = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            right.put(s.charAt(i), right.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            left.put(c, left.getOrDefault(c, 0) + 1);
            int k = right.get(c);
            if(k == 1)
                right.remove(c);
            else
                right.put(c, k-1);
            if(left.size() == right.size())
                count++;
        }
        return count;
    }
}
