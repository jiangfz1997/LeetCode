package Tree;

public class CountCompleteTreeNodes_0222 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    class Solution {
        public int countNodes(TreeNode root) {
            return root != null ? 1 + countNodes(root.left) + countNodes(root.right) : 0;
        }
    }
}
