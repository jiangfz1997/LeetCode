package Tree;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTree_0366 {
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
    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        // Shrink the tree
        while(root != null) {
            List<Integer> newList = new ArrayList<>();
            root = dfs(root, newList); // Reset root, only really needed for the last case where root becomes null
            result.add(newList);
        }
        return result;
    }

    private static TreeNode dfs(TreeNode root, List<Integer> list) {
        // Only leaf is root, delete it
        if(root == null) return null;
        // Reached leaf node, add to list, delete it
        if(root.left == null && root.right == null){
            list.add(root.val);
            return null;
        }
        // Reset left and right nodes to account for nulling out children
        root.left = dfs(root.left, list);
        root.right = dfs(root.right, list);
        return root;
    }
}
