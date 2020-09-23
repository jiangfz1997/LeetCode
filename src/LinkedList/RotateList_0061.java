package LinkedList;

import LinkedList.ListNode;

public class RotateList_0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode start = head, end = head;
        while(k != 0 ){
            if(end.next == null)
                end = head;
            else
                end = end.next;
            k--;
        }

        while(end.next != null){
            start = start.next;
            end = end.next;
        }
        end.next = head;
        head = start.next;
        start.next = null;
        return head;
    }
}
