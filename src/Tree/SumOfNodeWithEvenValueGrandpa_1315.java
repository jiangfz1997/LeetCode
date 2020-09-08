package Tree;

public class SumOfNodeWithEvenValueGrandpa_1315 {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        helper(false, false, root, 0, 0);
        return sum;
    }
    public void helper(boolean hasP, boolean hasG, TreeNode root, int pVal, int gVal){
        if(root == null) return;
        if(hasG){
            if(gVal % 2 == 0)
                sum+=root.val;
        }
        if(!(hasG || hasP))
            hasP = true;
        else
            hasG = hasP;
        helper(hasP, hasG, root.left, root.val, pVal);
        helper(hasP, hasG, root.right, root.val, pVal);
    }
}
