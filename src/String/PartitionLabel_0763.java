package String;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabel_0763 {
    public List<Integer> partitionLabels(String S) {
        int[] start = new int[26];
        int[] end =  new int[26];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            start[i] = -1;
            end[i] = -1;
        }
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(start[c-'a'] == -1) start[c-'a'] = i;
            end[c-'a'] = Math.max(end[c-'a'], i);
        }
        int maxEnd = 0;
        int pointer = 0;
        for(int i = 0; i < S.length(); i++ ){
            char c = S.charAt(i);
            maxEnd = Math.max(end[c-'a'], maxEnd);
            if(i == maxEnd){
                list.add(maxEnd - pointer+1);
                pointer = maxEnd + 1;
            }
        }
        return list;
    }
}
