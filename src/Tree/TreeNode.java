package Tree;

import java.util.List;

public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      public List<TreeNode> childrean;
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int x) { val = x; }
  }
