package Tree;

import java.util.ArrayList;
import java.util.List;

public class BTreePreorderTraversal_0144 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return list;
        this.list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
