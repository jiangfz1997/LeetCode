package LinkedList;

public class RemoveNthNodeFromEndofList_0019 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode endNode = dummy;
            ListNode startNode = dummy;
            for (int i = 1; i <= n + 1; i++) {
                endNode = endNode.next;
            }

            while(endNode != null){

                endNode = endNode.next;
                startNode = startNode.next;
            }

            startNode.next = startNode.next.next;

            return dummy.next;

        }
    }
}
