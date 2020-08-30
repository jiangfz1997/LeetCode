package 华为机试;
import java.util.*;
public class 删除字符串中出现次数最少的 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0)+1);
            }
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2){
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            int min = 0;
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < list.size(); i++){
                Map.Entry<Character, Integer> entry = list.get(i);
                if(i == 0)
                    min = entry.getValue();
                if(min == entry.getValue())
                    set.add(entry.getKey());
                else
                    break;
            }
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(!set.contains(c))
                    System.out.print(c);
            }
        }
    }
}
