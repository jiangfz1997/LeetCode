package String;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram_0242 {
    /*public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        if(sLength != tLength) return false; //if length is not equal, return false
        for(int i = 0; i < sLength; i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i),2)-1);
        }
        for(Integer i : hm.values()){
            if(i > 0) return false;
        }
        return true;
    }*/


   /* public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int[] map = new int[26];
        if(sLength != tLength) return false; //if length is not equal, return false
        for(int i = 0; i < sLength; i++){
            map[s.charAt(i)-97]++;
            map[t.charAt(i)-97]--;
        }
        for(int i : map){
            if(i != 0) return false;
        }
        return true;
    }*/

    //排序解法
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


}
