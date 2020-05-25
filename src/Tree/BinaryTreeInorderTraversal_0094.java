package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_0094 {



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
        public List<Integer> inorderTraversal(TreeNode root) {


            ArrayList<Integer> result = new ArrayList<>();
            if (root == null)  return result;
            print(result, root);
            return result;
        }

        public void print(ArrayList list, TreeNode n){
            if(n.left != null) print(list, n.left);

            list.add(n.val);

            if(n.right != null) print(list,n.right);

        }


    }
}
