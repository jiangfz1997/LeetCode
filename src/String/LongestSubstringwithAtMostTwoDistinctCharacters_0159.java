package String;

public class LongestSubstringwithAtMostTwoDistinctCharacters_0159 {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] map = new int[128];
        int counter = 0, begin =0,end=0,d=0;
        while(end<s.length()){

            if(map[s.charAt(end++)]++==0 ) counter++;/* modify counter here */

            while(counter > 2)if(map[s.charAt(begin++)]-- ==1) counter--;

            d = Math.max(d, end - begin);
        }
        return d;
    }
}
