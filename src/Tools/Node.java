package Tools;

import java.util.List;

public class Node {

        public int val;
        public Node next;
        public Node random;
        public List<Node> children;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

}
