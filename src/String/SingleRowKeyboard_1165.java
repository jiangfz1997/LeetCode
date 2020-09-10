package String;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard_1165 {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < keyboard.length(); i++){
            char c = keyboard.charAt(i);
            map.put(c, i);
        }
        int pivot = 0;
        int sum = 0;
        for(int i = 0; i < word.length(); i++){
            int tmp = map.get(word.charAt(i));
            sum += Math.abs(pivot - tmp);
            pivot = tmp;
        }
        return sum;
    }
}
