package Array;
/*
 * Similar to 0026

 * How to fix: Two pivots, start from the beginning, be aware of how the count work. If the number only appears one or two, it exchange with itself, but if there are multiple, then one pivot keep moving forward.
 * Complexity: O(n)
 * What's new: It should be easy, but feels complicate in my mind. Should try to draw a graph.
 * What reminds fixed: Non for now
 * */
public class RemoveDuplicatesfromSortedArrayII_0080 {
    public int removeDuplicates(int[] nums) {


        int j = 1, count = 1;


        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {

                count++;

            } else {

                count = 1;
            }

            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
