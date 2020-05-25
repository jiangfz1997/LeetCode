package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_aryTreeLevelOrderTraversal_0429 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };


    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;
            Queue<Node> queue = new LinkedList<>();

            queue.add(root);
            while(!queue.isEmpty()){
                List<Integer> levelList = new ArrayList<>();
                int size = queue.size();
                for(int i = 0; i < size; i++){
                    Node node = queue.poll();
                    levelList.add(node.val);
                    queue.addAll(node.children);
                }
                result.add(levelList);
            }

            return result;

        }
    }
}
