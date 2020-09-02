package Tree;

public class FlattenBinaryTree_0114 {
    public void flatten(TreeNode root) {

        this.helper(root);
    }
    public TreeNode helper(TreeNode node){
        if(node == null) return null;
        if(node.left == null && node.right == null) return node;
        TreeNode left = helper(node.left);
        TreeNode right = helper(node.right);
        if(left != null){
            left.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        return right == null? left:right;
    }
}
