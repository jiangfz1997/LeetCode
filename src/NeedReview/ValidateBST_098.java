package NeedReview;

public class ValidateBST_098 {

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
        public boolean isValidBST(TreeNode root) {
            return check(root, null, null);

        }
        public boolean check(TreeNode p, Integer min, Integer max){
            if(p == null) return true;
            int val = p.val;
            if(min != null && val <= min) return false;
            if(max != null && val >= max) return false;

            if(!check(p.left, min, val)) return false;
            if(!check(p.right, val, max)) return false;

            return true;
        }
    }
}
