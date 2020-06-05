package LinkedList;


// 当有环存在时，设定两个指针，一个移动较快，另一个移动较慢。当快指针移动到结尾则无环，若两指针相遇则说明有环
public class LinkedListCycle {


      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null || head.next == null) return false;
            ListNode slow = head;
            ListNode fast = head.next;

            while(slow != fast){
                if(fast == null || fast.next == null) return false;

                fast = fast.next.next;
                slow = slow.next;
            }

            return true;
        }
    }
}
