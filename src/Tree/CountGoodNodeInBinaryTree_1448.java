package Tree;

public class CountGoodNodeInBinaryTree_1448 {
    int number = 0;
    public int goodNodes(TreeNode root) {
        helper(root, Integer.MIN_VALUE);
        return number;
    }
    public void helper(TreeNode root, int maxVal){
        if(root == null)
            return;
        if(root.val >= maxVal){
            number++;
            maxVal = root.val;
        }
        helper(root.left, maxVal);
        helper(root.right, maxVal);

    }
}
