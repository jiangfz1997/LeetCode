package Tree;

import java.util.LinkedList;

public class MaximumWidthOfBinaryTree_0662 {
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
    /*public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int maxWidth = 0;
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair<TreeNode, Integer> first = queue.peek();
            int size = queue.size();
            Pair<TreeNode, Integer> curr = null;
            while(size-- > 0){
                curr = queue.poll();
                TreeNode node = curr.getKey();
                int index = curr.getValue();
                if(node.left != null) queue.offer(new Pair(node.left, 2 * index));
                if(node.right != null) queue.offer(new Pair(node.right, 2 * index + 1));
            }
            maxWidth = Math.max(maxWidth, curr.getValue() - first.getValue() + 1);
        }

        return maxWidth;
    }*/
}
