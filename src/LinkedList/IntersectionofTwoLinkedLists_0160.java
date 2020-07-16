package LinkedList;

import java.util.HashSet;
import java.util.Set;
import LinkedList.ListNode;
public class IntersectionofTwoLinkedLists_0160 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> map = new HashSet<>();
            while(headA != null){
                map.add(headA);
                headA = headA.next;
            }
            while(headB != null){
                if(map.contains(headB)) return headB;
                headB = headB.next;
            }
            return null;

        }
    }

}
