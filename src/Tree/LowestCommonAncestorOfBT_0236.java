package Tree;

public class LowestCommonAncestorOfBT_0236 {
    class Solution {
        private TreeNode result;
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return null;
            DFS(root, p, q);
            return result;


        }
        public boolean DFS(TreeNode root, TreeNode p, TreeNode q){
            if(root == null) return false;

            boolean left = DFS(root.left, p, q);
            boolean right = DFS(root.right, p, q);

            if((left && right) || ((left || right) && (root.val == p.val || root.val == q.val))) this.result = root;

            return (left || right || (root.val == p.val || root.val == q.val));
        }
    }
}
