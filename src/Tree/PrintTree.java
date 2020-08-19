package Tree;

public class PrintTree {
    public static void Print(TreeNode node){
        if(node == null) return;
        System.out.println(node.val);
        Print(node.left);
        Print(node.right);
    }
}
