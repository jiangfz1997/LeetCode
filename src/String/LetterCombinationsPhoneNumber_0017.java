package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber_0017 {
    Map<String, String> map = new HashMap<>(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<String>();
    public void backTrack(String combination, String next){
        if(next.length() == 0){ output.add(combination);}
        else{ String digit = next.substring(0, 1);

            String letter = map.get(digit);

            for(int i = 0; i < letter.length(); i++){
                String tmp = letter.substring(i, i+1);
                backTrack(combination + tmp, next.substring(1));
            }}

    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backTrack("", digits);
        return output;

    }

}
