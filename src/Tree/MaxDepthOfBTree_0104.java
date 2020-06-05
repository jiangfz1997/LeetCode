package Tree;

public class MaxDepthOfBTree_0104 {

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
    public int maxDepth(TreeNode root) {

        if(root == null){ return 0;}
        else{
            int maxLeft = maxDepth(root.left);
            int maxRight = maxDepth(root.right);
            return Math.max(maxLeft, maxRight)+1;
        }



    }
}
