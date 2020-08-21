package Test;

import java.util.Arrays;
import java.util.Stack;

public class TestCharacterStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < 5; i++){
            stack.push('i');
        }
        String s = Arrays.toString(stack.toString().split(","));
        System.out.println(s.length());


    }
}
