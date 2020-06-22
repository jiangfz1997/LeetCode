package Array;

import java.util.ArrayList;
import java.util.List;

public class Subset_0078 {
    List<List<Integer>> output = new ArrayList();
    int n, k;

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        // if the combination is done
        if (curr.size() == k)
            output.add(new ArrayList(curr));

        for (int i = first; i < n; ++i) {
            // add i into the current combination
            curr.add(nums[i]);
            System.out.println(curr.toString());
            // use next integers to complete the combination
            backtrack(i + 1, curr, nums);
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k = 0; k < n + 1; ++k) {
            System.out.println(k);
            backtrack(0, new ArrayList<Integer>(), nums);
            System.out.println(output);

        }
        return output;
    }
    public  static void main(String[] args){
        Subset_0078 s = new Subset_0078();

        int[] i = new int[]{1, 2, 3};
        s.subsets(i);
        System.out.println(s.output);
    }
}
