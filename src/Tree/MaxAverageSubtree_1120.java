package Tree;

public class MaxAverageSubtree_1120{
    double maxValue = Integer.MIN_VALUE;
    public double maximumAverageSubtree(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return maxValue;
    }

    public double[] dfs(TreeNode node){

        double[] res = new double[2];
        if(node == null){

            res[0] = 0;
            res[1] = 0;
            return res;
        }
        double[] left = dfs(node.left);
        double[] right = dfs(node.right);
        res[0] = left[0] + right[0] + 1;
        res[1] = left[1]+right[1]+node.val;
        double sum = (res[1])/(res[0]);
        maxValue = Math.max(maxValue, sum);
        return res;
    }
}
