package 剑指offer;

import Tree.BuildTree;
import Tree.PrintTree;
import Tree.TreeNode;

public class 第k个节点 {
    static int count = 0;
    public static TreeNode KthNode(TreeNode pRoot, int k)
    {
        count = k;
        return traverse(pRoot);

    }

    public TreeNode findMin(TreeNode pRoot){
        if(pRoot.left == null) return pRoot;
        else return findMin(pRoot.left);
    }
    public static TreeNode traverse(TreeNode pRoot){
        if(pRoot == null) return null;
        traverse(pRoot.left);
        count--;
        if(count == 0) return pRoot;

        traverse(pRoot.right);
        return null;
    }

    public static void main(String[] args) {
        BuildTree bt = new BuildTree();
        int[] a = {8,6,10,5,7,9,11};

        TreeNode node = bt.build(a,0);
        PrintTree.Print(node);
        TreeNode node22 = KthNode(node, 5);
        System.out.println(node22);
    }
}
