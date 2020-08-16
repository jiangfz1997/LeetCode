package 剑指offer;

import Array.FirstMissingPositive_0041;

import java.util.LinkedHashMap;

public class 第一个只出现一次的字符 {
    public static int FirstNotRepeatingChar(String str) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int[] save = new int[52];

        for(int i = 0; i < str.length(); i++){
            String subStr = str.substring(i, i+1);
            if(map.get(subStr) == null){
                map.put(subStr, 1);
                int position = str.charAt(i) - 'a' < 0 ? str.charAt(i) - 'A' +26: str.charAt(i) - 'a';
                save[position] = i;
            }else{
                map.put(subStr, map.get(subStr)+1);
            }
        }
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                if(s.charAt(0) - 'a' < 0){
                    return save[s.charAt(0) - 'A' +26];
                }else{
                    return save[s.charAt(0) - 'a'];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("Google"));
    }
}
