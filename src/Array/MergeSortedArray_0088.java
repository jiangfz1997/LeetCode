package Array;

import java.util.Collections;
import java.util.Comparator;

public class MergeSortedArray_0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = nums1.length-1;

        for(;end >= 0;end--){
            if(m == 0){
                nums1[end] = nums2[n-1];
                n--;
                continue;
            }
            if(n == 0){
                return;
            }

            int s1 = nums1[m-1];
            int s2 = nums2[n-1];
            if(s1 >= s2){
                nums1[end] = s1;
                m--;
            }else{
                nums1[end] = s2;
                n--;
            }
        }

        return;


    }


}
