package String;

import java.util.LinkedList;

public class BasicCalculator_0227 {
    public static int calculate(String s) {
        LinkedList<Integer> num = new LinkedList<>();
        LinkedList<Character> sym = new LinkedList<>();
        String s2 = s.replace(" ", "");
        String[] tmp = s2.split("\\+|-|\\*|/");
        int j = 0;
        for(int i = 0; i < s2.length() && j < tmp.length; ){
            char c = s2.charAt(i);
            if(Character.isDigit(c)){
                while(i < s2.length()-1 && Character.isDigit(s2.charAt(i))){
                    i++;
                }
                int tmpNum = Integer.parseInt(tmp[j]);
                j++;
                if(sym.size() > 0 && sym.peek() == '*'){
                    sym.pop();
                    num.push(num.pop() * tmpNum);

                }else if(sym.size() > 0 && sym.peek() == '/'){
                    sym.pop();
                    num.push(num.pop()/tmpNum);
                }else {
                    num.push(tmpNum);

                }
            }else{
                sym.push(c);
                i++;
            }

        }

        while(num.size() != 1){
            char c = sym.pollLast();
            int a = num.pollLast();
            int b = num.pollLast();
            if(c == '+')
                num.add(a+b);
            else
                num.add(a-b);
        }
        return num.pop();
    }

    public static void main(String[] args) {
        System.out.println(calculate("1+1-1"));
    }

}

