package Top100Liked;

public class AddTwoNumber_002 {

    /*
     * Just a simple question about adding two numbers bit by bit
     * How to fix: Doing calculation bit by bit, remember the carry.
     * Complexity: O(n)
     * What's new: Learned How to Define a Data type.
     * What reminds fixed: Non for now
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;
        int carry = 0;
        while(p != null || q != null){
            int x = (p != null)? p.val : 0;
            int y = (q != null)? q.val : 0;
            int sum = carry + x + y;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }

        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return result.next;
    }
}
