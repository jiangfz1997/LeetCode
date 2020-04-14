package Array;
/*
* Easy problem but need to be careful.It does not need to return the whole array.

     * How to fix: Two pivots, start from the beginning, keep moving all the different element to the front. Kind like bubble sort.
     * Complexity: O(n)
     * What's new: Learned that not all two pivots starts from the front and back.
     * What reminds fixed: Non for now
* */

public class RemoveElement_0027 {

    public int removeElement(int[] nums, int val) {
        int i = 0;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String args[]){
        RemoveElement_0027 r = new RemoveElement_0027();
        int[] nums = {4,5};
        System.out.println(r.removeElement(nums,4));
    }
}
