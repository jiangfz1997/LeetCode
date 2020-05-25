package Tree;

public class SubtreeOfAnotherTree_0572 {


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
        public boolean isSubtree(TreeNode s, TreeNode t) {
            return traverse(s, t);
        }

        public boolean equal(TreeNode x, TreeNode y){
            if(x == null && y == null)
                return true;
            if(x == null || y == null)
                return false;
            return x.val == y.val && equal(x.left, y.left) && equal(x.right, y.right);
        }

        public boolean traverse(TreeNode s, TreeNode t){
            return s!=null && (equal(s, t) || traverse(s.left, t) || traverse(s.right, t));
        }
    }
}
