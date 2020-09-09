package String;

public class RemoveVowel_1119 {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                continue;
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
