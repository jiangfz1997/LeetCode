package Explore;


import Tools.Node;

import java.util.HashMap;

public class DeepCopyNode {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        map.put(head, newHead);
        Node result = newHead;
        while(head!=null ){
            if(!map.containsKey(head.next) && head.next != null){
                Node next = new Node(head.next.val);
                newHead.next = next;
                map.put(head.next, next);
            }else if(head.next == null){

            }else{
                newHead.next = map.get(head.next);
            }
            if(!map.containsKey(head.random) && head.random != null){
                Node random = new Node(head.random.val);
                newHead.random = random;
                map.put(head.random, random);
            }else if(head.random == null){

            }else{
                newHead.random = map.get(head.random);
            }
            newHead = newHead.next;
            head = head.next;
        }
        return result;
    }
}
