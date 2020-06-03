package String;

public class ImplementStr_0028 {
    public int strStr(String haystack, String needle) {
        int start = 0;
        int end = needle.length()-1;
        String a= "hello";
        String b = a.substring(2,4);
        System.out.println(b);
        while(end < haystack.length()){
            String s = haystack.substring(start, end);
            if(s.equals(needle)) return start;
            start++;
            end++;
        }
        return -1;
    }

    public static void main(String args[]){
        ImplementStr_0028 i = new ImplementStr_0028();
        i.strStr("aaa","a");
    }
}
