package String;

import java.util.Stack;

public class SimplifyPath_0071 {
    public String simplifyPath(String path) {
        if(path.isEmpty()){
            return path;
        }
        Stack<String> stack = new Stack<String>();
        String[] buffer = path.split("/");
        for(String s : buffer){
            if(s.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }else if(s.equals(".") || s.isEmpty()){
                continue;
            }else{
                stack.add(s);
            }
        }
        StringBuilder result = new StringBuilder();
        for(String s : stack){
            result.append("/");
            result.append(s);
        }
        return result.length() > 0?result.toString():"/";

    }
}
