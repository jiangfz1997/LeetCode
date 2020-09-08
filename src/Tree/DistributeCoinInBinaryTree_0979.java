package Tree;

public class DistributeCoinInBinaryTree_0979 {
    int count = 0;
    public int distributeCoins(TreeNode root) {
        helper(root);
        return count;
    }
    public int helper(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return root.val-1;
        int left = root.left == null ? 0 : helper(root.left);
        int right = root.right == null ? 0 : helper(root.right);
        int tmp = root.val-1+right+left;
        count += Math.abs(left);
        count += Math.abs(right);
        return tmp;
    }
}
