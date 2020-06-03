package String;

public class LoangestCommonPrefix_0014 {
    public String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];
        int k = 0;

        while( k < s1.length()){
            for(int i = 1; i < strs.length; i++){
                String s = strs[i];

                if(k == s.length()) return s1.substring(0,k);
                if(s.charAt(k) != s1.charAt(k)) return s1.substring(0,k);
            }
            k++;
        }
        return s1.substring(0,k);
    }
    public static void main(String args[]){
        LoangestCommonPrefix_0014 l = new LoangestCommonPrefix_0014();
        String[] s = {"aa", "a"};
        String sl = l.longestCommonPrefix(s);
    }
}
