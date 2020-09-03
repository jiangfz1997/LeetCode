package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTLevelOrderTraverse_0107 {
    List<List<Integer>> result ;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        this.result = new ArrayList<>();
        helper(root, 0, result);
        Collections.reverse(result);
        return result;
    }
    public void helper(TreeNode root, int count, List<List<Integer>> result){
        if(root == null) return ;

        if(result.size() == count){
            List<Integer> list = new ArrayList<>();
            result.add(list);
        }
        helper(root.left, count+1, result);
        helper(root.right, count+1, result);
        result.get(count).add(root.val);

    }
}
