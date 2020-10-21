package Tree;

import java.util.ArrayList;
import java.util.List;

public class BTreePostorder_0145 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
            return list;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        this.list.add(root.val);
        return list;
    }
}
