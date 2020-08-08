package Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ConstructBTreeFromTraverse_0105 {
    private Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);

    }

    public TreeNode helper(int[] preorder, int[] inorder, int pStart, int pEnd, int inStart, int inEnd){


        if(pStart > pEnd) return null;
        TreeNode root = new TreeNode(preorder[pStart]);

        int pivot = map.get(preorder[pStart]);
        int left = pivot;
        int right = pivot+1;
        Stack<Integer> s = new Stack<>();

        root.left = helper(preorder, inorder, pStart+1, pStart + left-inStart, inStart , left);
        root.right = helper(preorder, inorder, pStart+left-inStart+1, pEnd, right, inEnd);
        return root;
    }
}
