package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_0217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}
