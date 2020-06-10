package String;

public class IsSubsequence_0392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length()?true:false;
    }
}
