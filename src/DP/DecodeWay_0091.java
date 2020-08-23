package DP;

import java.util.HashMap;

public class DecodeWay_0091 {
    public int numDecodings(String s) {
        if(s.length() == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(s, 0, map);
    }

    public int helper(String s, int pivot, HashMap<Integer, Integer> map){

        if (pivot == s.length()) {
            return 1;
        }

        // If the string starts with a zero, it can't be decoded
        if (s.charAt(pivot) == '0') {
            return 0;
        }

        if (pivot == s.length()-1) {
            return 1;
        }


        if(map.containsKey(pivot)) return map.get(pivot);

        int ans = helper(s, pivot+1, map);
        if(Integer.parseInt(s.substring(pivot, pivot+2)) <= 26){
            ans += helper(s, pivot+2, map);
        }

        map.put(pivot, ans);
        return ans;

    }
}
