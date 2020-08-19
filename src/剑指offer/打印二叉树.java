package 剑指offer;

import Tree.BuildTree;
import Tree.PrintTree;
import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 打印二叉树 {
    public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        int num = 1;
        int nextNum = 0;
        queue.add(pRoot);
        ArrayList<Integer> list = null;
        boolean flag = true;
        while(!queue.isEmpty()){
            if(flag){
                list = new ArrayList<>();
                flag = false;
            }
            TreeNode node = queue.poll();
            num--;
            list.add(node.val);
            if(node.left != null){
                queue.add(node.left);
                nextNum++;
            }
            if(node.right != null){
                queue.add(node.right);
                nextNum++;
            }
            if(num == 0){
                result.add(list);
                num = nextNum;
                nextNum = 0;
                flag = true;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        BuildTree bt = new BuildTree();
        int[] a = {8,6,10,5,7,9,11};

        TreeNode node = bt.build(a,0);
        PrintTree.Print(node);
        ArrayList<ArrayList<Integer>> test = Print(node);
        test.toString();
    }
}
