package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTreeLevelOrderTraversal_0102 {


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
        public List<List<Integer>> levelOrder(TreeNode root) {


            List<List<Integer>> result = new ArrayList<List<Integer>>();

            if(root == null) return result;
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            q.add(root);
            int level = 0;


            while(!q.isEmpty()){

                result.add(new ArrayList<Integer>());

                // number of elements in the current level
                int level_length = q.size();

                for(int i = 0; i < level_length; i++){

                    TreeNode tmp = q.remove();
                    result.get(level).add(tmp.val);

                    if(tmp.left != null) q.add(tmp.left);
                    if(tmp.right != null) q.add(tmp.right);
                }
                level++;


            }

            return result;
        }
    }
}
