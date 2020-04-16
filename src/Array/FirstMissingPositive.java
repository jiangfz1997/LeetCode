package Array;
/*

 * How to fix: Use the index as hash key. put all the positive numbers {i} in tmp[], which tmp[i] = i, then the missing one should be 0;
 * Complexity: O(n)
 * What's new: Remember that the index of the array could be useful when coming to a fixed space complexity.
 * What reminds fixed: Non for now
 * */



public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int tmp[] = new int[nums.length+1];
        System.out.println(tmp.length);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 1 && nums[i] < tmp.length){
                tmp[nums[i]] = nums[i];
                System.out.println("tmp is: "+tmp[nums[i]] + ", i is "+ i + " nums is "  + nums[i]);
            }
        }
        int result =1 ;
        int i = 1;
        for(; i < tmp.length; i++){
            if(tmp[i] == 0){
                result = i;
                System.out.println(i+" "+result);
                break;
            }
            result = tmp[i]+1;
        }
        return result;
    }

    public static void main(String args[]){
        FirstMissingPositive f = new FirstMissingPositive();
       int[] nums = {1};
        int m = f.firstMissingPositive(nums);
        System.out.println(m);
    }
}
