package Tree;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray_0525 {
    class Solution {
        public int findMaxLength(int[] nums) {
            Map<Integer, Integer> m = new HashMap<>();
            int sum = 0;
            int ans = 0;


            for(int i = 0; i < nums.length; i++){
                sum += (nums[i] == 1)? 1:-1;
                if(sum == 0) ans =i+ 1;
                if(m.containsKey(sum)) ans =Math.max(i - m.get(sum), ans) ;
                else{
                    m.put(sum, i);
                }
            }
            return ans;
        }
    }
}
