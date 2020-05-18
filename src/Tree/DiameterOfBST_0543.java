package Tree;

public class DiameterOfBST_0543 {


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


        int max;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null) return 0;
            max = 0;
            depth(root);
            return max - 1;

        }

        public int depth(TreeNode node){
            if(node == null) return 0;
            int L = depth(node.left);
            int R = depth(node.right);

            max = Math.max(max, L+R+1);
            return Math.max(L,R)+1;
        }

}
