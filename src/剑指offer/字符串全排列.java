package 剑指offer;
import java.util.*;
public class 字符串全排列 {
    public static ArrayList<String> result = new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
        if(str.length() == 0) return result;
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);

        nextString(strArray, 0);
        return result;

    }

    public static void nextString(char[] charArray, int count){
        if(count >= charArray.length ){
            result.add(String.valueOf(charArray)); return;
        }

        for(int i = count; i < charArray.length; i++){

            char temp = charArray[count];
            charArray[count] = charArray[i];
            charArray[i] = temp;
            nextString(charArray, count+1);
            temp = charArray[count];
            charArray[count] = charArray[i];
            charArray[i] = temp;
        }

    }

    public static void main(String[] args) {
        Permutation("aa");
        for(String s : result){
            System.out.println(s);
        }
    }
}
