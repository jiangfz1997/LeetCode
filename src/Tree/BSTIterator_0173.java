package Tree;

import java.util.Stack;

public class BSTIterator_0173 {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator_0173(TreeNode root) {
        helper(root);
    }
    public void helper(TreeNode root){
        if(root == null)
            return;
        helper(root.right);
        stack.push(root);
        helper(root.left);
        return;
    }

    /** @return the next smallest number */
    public int next() {
        return stack.pop().val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
