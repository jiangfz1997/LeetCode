package Tree;

public class DeepestLeaveSum_1302 {
    int sum = 0;
    int maxLevel = 0;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        dfs(root, 0);
        return sum;
    }
    public void dfs(TreeNode root, int level){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(level == maxLevel){
                sum += root.val;
            }else if(level > maxLevel){
                sum = root.val;
                maxLevel = level;
            }
        }
        else{
            dfs(root.left, level+1);
            dfs(root.right, level+1);
        }
    }
}
