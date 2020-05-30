package Array;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArray_0350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length) return intersect(nums2, nums1);

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int nums : nums1){
            hm.put(nums, hm.getOrDefault(nums,0)+1);
        }
        int[] result = new int[nums2.length];
        int k = 0;
        for (int n : nums2) {
            int cnt = hm.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                hm.put(n, cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);



    }
}
