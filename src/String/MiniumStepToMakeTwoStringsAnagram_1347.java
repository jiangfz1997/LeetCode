package String;

public class MiniumStepToMakeTwoStringsAnagram_1347 {
    public int minSteps(String s, String t) {
        int[] charS = new int[26];

        for(int i = 0; i < s.length(); i++){
            charS[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            charS[t.charAt(j) - 'a']--;
        }
        int sum = 0;
        for(int i = 0; i < 26; i++){
            if(charS[i] > 0)
                sum += charS[i];
        }
        return sum;
    }
}
