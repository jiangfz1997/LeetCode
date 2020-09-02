package Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisapper_0448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int tmp = Math.abs(nums[i])-1;
            if(nums[tmp] > 0) nums[tmp] *= -1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                list.add(i+1);
        }
        return list;
    }
}
