package Array;

import java.util.*;

public class CombinationSum_0039__回溯 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> list, int[] array, int target, int startPoint){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = startPoint; i < array.length; i++){
            if(array[i] > target) return;
            list.add(array[i]);
            helper(result, list, array, target - array[i], i);
            list.remove(list.size()-1);
        }
    }
}
