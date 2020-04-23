package Array;

import java.util.*;
/*
 * Seems the same but different from 243

 * How to fix: Build a hashmap to record it.
 * Complexity: O(n)
 * What's new: When coming to "Multiple times", you need to think about the "Precomputation", which means that you need try to prevent doing one things multiple time.
 * What reminds fixed: Non for now
 * */
public class WordDistanceII_0244 {
    Map<String, ArrayList<Integer>> map;

    public WordDistanceII_0244(String[] words) {
        this.map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i]))
                map.get(words[i]).add(i);
            else
                map.put(words[i], new ArrayList<Integer>(Arrays.asList(i)));
        }
    }

    public int shortest(String word1, String word2) {
        if(word1 == null || word2 == null)
            return Integer.MAX_VALUE;

        List<Integer> word1s = map.get(word1);
        List<Integer> word2s = map.get(word2);
        int minDistance = Integer.MAX_VALUE;
        int i = 0, j = 0;

        while(i < word1s.size() && j < word2s.size()) {
            minDistance = Math.min(minDistance, Math.abs(word1s.get(i) - word2s.get(j)));
            if(word1s.get(i) < word2s.get(j))
                i++;
            else
                j++;
        }

        return minDistance;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
