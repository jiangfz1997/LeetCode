package String;

public class LengthOfLastWord_0058 {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int length = s.length()-1;
        int count = 0;
        while(length >=0 && s.charAt(length) == ' ') length--;
        while(length >= 0 && s.charAt(length) != ' ' ){
            count++;
            length--;
        }
        return count;
    }
}
