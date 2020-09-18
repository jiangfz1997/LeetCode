package DP;

public class PalindromicSubstrings_0647 {
    public int countSubstrings(String s) {
        boolean[] cache = new boolean[s.length()];
        int count = 0;
        boolean tmp1 = true, tmp2 = true;
        for(int i = s.length()-1; i >=0; i--){
            for(int j = i; j < s.length(); j++){
                boolean flag = false;
                tmp1 = tmp2;
                tmp2 = cache[j];
                if(i == j)
                    flag = true;
                else if(j - i == 1)
                    flag = s.charAt(j) == s.charAt(i);
                else
                    flag = tmp1 && s.charAt(j) == s.charAt(i);
                if(flag)
                    count++;
                cache[j] = flag;
            }
        }
        return count;
    }
}
