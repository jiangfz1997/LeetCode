package Tree;

import Tools.Node;

public class CloneN_arrayTree_1490 {
    public Node cloneTree(Node root) {
        if(root == null) return root;
        Node copy = new Node(root.val);

        for(int i = 0; i < root.children.size(); i++){
            copy.children.add(cloneTree(root.children.get(i)));
        }

        return copy;
    }
}
