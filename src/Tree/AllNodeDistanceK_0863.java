package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllNodeDistanceK_0863 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        Map<TreeNode , TreeNode> map = new HashMap<>();
        TreeNode start;
        List<Integer> list = new ArrayList<>();
        public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
            dfs(root, null, target);
            if(root == null || target == null) return list;
            if(K == 0){
                list.add(target.val);
                return list;
            }
            find(start,start,K);


            return list;
        }

        public void find(TreeNode root, TreeNode target, int K){
            if(root == null || K < 0) return;
            if(K == 0){
                list.add(root.val);
                return;
            }else if(K > 0){
                if(root.left != target) find(root.left, root, K-1);
                if(root.right != target) find(root.right, root, K-1);
                if(map.get(root) != target) find(map.get(root), root, K-1);
            }
        }
        public void dfs(TreeNode root, TreeNode parent, TreeNode target){
            if(root == null) return;
            if(parent != null) map.put(root, parent);
            if(root == target) start = root;

            dfs(root.left, root, target);
            dfs(root.right, root, target);
        }

    }
}
