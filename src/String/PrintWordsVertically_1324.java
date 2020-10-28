package String;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically_1324 {

    class Solution {
        public List<String> printVertically(String s) {
            String[] sList = s.split(" ");
            List<String> list = new ArrayList<>();
            int n = 0;
            boolean flag = true;
            while(flag){
                StringBuffer sb = new StringBuffer();
                flag = false;
                for(int i = 0; i < sList.length; i++){
                    if(n < sList[i].length()){
                        sb.append(sList[i].substring(n, n+1));
                        flag = true;
                    }else{
                        sb.append(" ");
                    }

                }

                for(int i = sb.length()-1; i >=0; i--){
                    if(sb.charAt(i) != ' '){
                        break;
                    }else{
                        sb.deleteCharAt(i);
                    }
                }
                if(flag){
                    list.add(sb.toString());
                }
                n++;
            }
            return list;


        }
    }
}
