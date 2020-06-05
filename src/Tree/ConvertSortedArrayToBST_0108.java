package Tree;
/*取中间点做BST时，使用左右两个指针 + 递归即可*/


public class ConvertSortedArrayToBST_0108 {

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
        int[] nums;

        public TreeNode sorted(int left, int right){
            if(left > right) return null;

            int middle = (left + right )/2;

            TreeNode root = new TreeNode(nums[middle]);
            root.left = this.sorted(left, middle - 1);
            root.right = this.sorted(middle + 1, right);
            return root;
        }
        public TreeNode sortedArrayToBST(int[] nums) {
            this.nums = nums;
            return sorted(0, nums.length-1);
        }
    }
}
