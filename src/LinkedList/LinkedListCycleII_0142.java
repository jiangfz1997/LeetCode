package LinkedList;

public class LinkedListCycleII_0142 {



      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head == null) return null;
            ListNode slow = head;
            ListNode fast = head;
            do{
                if(slow.next == null || fast.next == null || fast.next.next == null) return null;
                slow = slow.next;
                fast = fast.next.next;

            }while(slow != fast);

            if(slow == head) return head;
            slow = head;
            do{
                slow = slow.next;
                fast= fast.next;
            }while(slow != fast);

            return slow;
        }
    }
}
