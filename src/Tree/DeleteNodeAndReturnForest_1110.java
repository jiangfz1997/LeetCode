package Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodeAndReturnForest_1110 {
    Set<Integer> set = new HashSet<>();
    List<TreeNode> list = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int i : to_delete)
            set.add(i);
        helper(root, true);
        return list;

    }
    public boolean helper(TreeNode root, boolean isRoot){
        if(root == null)
            return false;
        boolean flag = false;
        if(set.contains(root.val)){
            flag = true;
            //set.remove(root.val);
        }
        if(isRoot && !flag)
            list.add(root);
        if(helper(root.left, flag))
            root.left = null;
        if(helper(root.right, flag))
            root.right = null;
        return flag;
    }
}
