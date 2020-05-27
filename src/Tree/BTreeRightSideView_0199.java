package Tree;

import java.util.*;

public class BTreeRightSideView_0199 {

      public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Map<Integer, Integer> rightMost = new HashMap<Integer, Integer>();

            Stack<TreeNode> nodeStack = new Stack<TreeNode>();
            Stack<Integer> depthStack = new Stack<Integer>();

            nodeStack.add(root);
            depthStack.add(0);
            int max_depth = -1;
            while(!nodeStack.isEmpty()){
                TreeNode node = nodeStack.pop();
                int depth = depthStack.pop();

                if(node != null){
                    max_depth = Math.max(max_depth, depth);
                    if(!rightMost.containsKey(depth)){
                        rightMost.put(depth, node.val);
                    }
                    nodeStack.push(node.left);
                    nodeStack.push(node.right);
                    depthStack.push(depth + 1);
                    depthStack.push(depth + 1);
                }

            }

            for(int i = 0; i <= max_depth; i++){
                result.add(rightMost.get(i));
            }

            return result;
        }

    }
}
