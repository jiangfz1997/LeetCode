package 方法分类.回溯;
import java.util.*;
public class GenerateParenthese_0022 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, new String(), 0, 0, n);
        return result;
    }

    public void helper(List<String> result, String s, int left, int right, int n){
        if(left == n && right == n){
            result.add(s);
        }else{
            if(left < n) helper(result, s+"(", left+1, right, n);
            if(right < left) helper(result, s + ")",left, right+1, n);
        }
    }
}
