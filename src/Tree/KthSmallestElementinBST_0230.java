package Tree;

public class KthSmallestElementinBST_0230 {
    int result;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return result;
    }
    public int helper(TreeNode root, int k){
        if(root == null)
            return k;
        k = helper(root.left, k);
        k = k-1;
        if(k == 0){
            result = root.val;
            return k-1;
        }
        k = helper(root.right, k);
        return k;

    }
}
