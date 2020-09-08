package Tree;

import java.util.ArrayList;
import java.util.List;

public class FindAllLonelyNode_1469 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
        dfs(root);
        return list;

    }
    public void dfs(TreeNode node){
        if(node == null || (node.left == null && node.right == null)) return;
        if(node.left == null){
            list.add(node.right.val);
            dfs(node.right);
        }else if(node.right == null){
            list.add(node.left.val);
            dfs(node.left);
        }else{
            dfs(node.left);
            dfs(node.right);
        }

    }
}
