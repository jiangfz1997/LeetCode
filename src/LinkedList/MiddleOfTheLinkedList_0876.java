package LinkedList;

public class MiddleOfTheLinkedList_0876 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode array = head;

        while(array != null && array.next != null){
            mid = mid.next;
            array = array.next.next;
        }
        return mid;
    }
}
