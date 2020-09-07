package String;

public class ZigzagConversion_0006 {
    public String convert(String s, int numRows) {
        if(s == null || numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        int[] cache = new int[s.length()];
        for(int i = 0; i < numRows; i++){
            int head = i;
            int n = (numRows-i) + (numRows-2-i);
            while(head < s.length() ){
                if(cache[head] == 0){
                    char c = s.charAt(head);
                    sb.append(c);
                    cache[head] = 1;
                }
                if( head+n < s.length() && cache[head+n] == 0 ){
                    sb.append(s.charAt(head + n));
                    cache[head+n] = 1;
                }
                head = head+n+2*i;
            }
        }
        return sb.toString();
    }
}
