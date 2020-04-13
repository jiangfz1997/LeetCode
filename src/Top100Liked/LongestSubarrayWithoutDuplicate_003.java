package Top100Liked;

import java.util.HashMap;
import java.util.Map;

/*
 * Need to find the longest subarray without duplication
 * How to fix:
 * There'are two way fixing it:
 * 1. Sliding window： define a pivot at the beginning, then moving on one by one, if it has never appear before, add it to the
 *    map, if it did appear, move the pivot to the character next to this one. In other words, discard the former part of the String.
 * 2. Dynamic Programming:
 *
 * Complexity: O(n)
 * What's new: Need to remember the usage of sliding window
 * What reminds fixed: How to do it in Dynamic Programming
 *
 * */

public class LongestSubarrayWithoutDuplicate_003 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args){
        LongestSubarrayWithoutDuplicate_003 l = new LongestSubarrayWithoutDuplicate_003();
        System.out.println(l.lengthOfLongestSubstring("abba" ));
    }

}
