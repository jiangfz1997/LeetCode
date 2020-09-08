package Tree;

public class PseudoPalindromicPathsinBinaryTree_1457 {
    int[] cache = new int[9];
    int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root == null) return 0;
        cache[root.val-1]++;
        if(root.left == null && root.right == null)
            if(test(cache)) count++;
        pseudoPalindromicPaths(root.left);
        pseudoPalindromicPaths(root.right);
        cache[root.val-1]--;
        return count;
    }

    public boolean test(int[] cache){
        int odd = 0;
        int even = 0;
        for(int i = 0; i < 9; i++){
            if(cache[i] % 2  == 0)
                even++;
            else
                odd++;
        }
        if(odd <= 1)
            return true;
        return false;
    }
}
