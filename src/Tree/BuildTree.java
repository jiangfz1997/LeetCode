package Tree;

public class BuildTree {
    TreeNode root = null;
    public TreeNode build(int[] a, int num){
        if(num >= a.length) return null;
        if(a[num] == -1) return null;
        TreeNode node = new TreeNode(a[num]);
        if(this.root == null) root = node;
        num = num*2+1;
        node.left = build(a, num);
        num = num+1;
        node.right = build(a, num);
        return node;

    }
}
