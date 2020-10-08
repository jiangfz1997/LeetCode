package 方法分类.回溯;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation_0784 {
    List<String> list = new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        helper(S, new StringBuilder(), 0);
        return list;
    }

    public void helper(String S, StringBuilder sb, int pivot){
        if(pivot == S.length()){
            list.add(sb.toString());
        }
        sb.append(S.charAt(pivot));
        helper(S, sb, pivot+1);
        sb.deleteCharAt(sb.length());
        if(Character.isUpperCase(S.charAt(pivot))){
            sb.append(Character.toLowerCase(S.charAt(pivot)));
            helper(S, sb, pivot+1);
            sb.deleteCharAt(sb.length());
        }
        if(Character.isLowerCase(S.charAt(pivot))){
            sb.append(Character.toUpperCase(S.charAt(pivot)));
            helper(S, sb, pivot+1);
            sb.deleteCharAt(sb.length());
        }
        return;


    }
}
