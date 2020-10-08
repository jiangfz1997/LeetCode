package Tree;

public class MaxBinaryTree_0654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length-1);

    }
    public TreeNode helper(int[] nums, int left, int right){
        if(left == right){
            return new TreeNode(nums[left]);
        }
        if(left > right){
            return null;
        }
        int[] tmp = max(nums, left, right);
        TreeNode node = new TreeNode(tmp[0]);
        node.left = helper(nums, left, tmp[1]-1);
        node.right = helper(nums, tmp[1]+1, right);
        return node;
    }
    public int[] max(int[] nums, int left, int right){
        int[] result = new int[2];
        result[0] = Integer.MIN_VALUE;
        result[1] = 0;
        for(int i = left; i <= right; i++){
            if(nums[i] > result[0]){
                result[0] = nums[i];
                result[1] = i;
            }
        }
        return result;
    }
}
