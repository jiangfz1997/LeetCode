package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleBySize_1282 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                if(groupSizes[i] == 1)
                    result.add(tmp);
                else
                    map.put(groupSizes[i], tmp);

            }else{
                List<Integer> tmp = map.get(groupSizes[i]);
                if(tmp.size() == groupSizes[i]){
                    result.add(tmp);
                    map.remove(groupSizes[i]);
                    List<Integer> tmp2 = new ArrayList<>();
                    tmp2.add(i);
                    if(groupSizes[i] == 1)
                        result.add(tmp2);
                    else
                        map.put(groupSizes[i], tmp2);
                }else{
                    tmp.add(i);
                    map.put(groupSizes[i], tmp);
                }

            }
        }
        if(map.size() != 0){
            for(Map.Entry<Integer, List<Integer>> list : map.entrySet())
                result.add(list.getValue());
        }
        return result;
    }
}
