package String;

import java.util.*;

public class GroupAnagrams_0049 {

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            if(strs.length == 0) return new ArrayList();

            Map<String, List> m = new HashMap<>();
            for(String s: strs){
                char[] c = s.toCharArray();
                Arrays.sort(c);
                String tmp = String.valueOf(c);
                if(!m.containsKey(tmp)) m.put(tmp, new ArrayList());
                m.get(tmp).add(s);
            }

            return new ArrayList(m.values());
        }
    }
}
