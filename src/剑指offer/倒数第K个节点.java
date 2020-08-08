package 剑指offer;

import Array.FindFirstLastElementInSortedArray_0034;
import LinkedList.ListNode;

public class 倒数第K个节点 {
    public static ListNode FindKthToTail(ListNode head, int k) {
        if(head == null) return null;
        ListNode result = FindKthToTail(head.next, k);
        k--;
        if(k == 0) return head;
        return result;
    }

    public static void main(String[] args) {

    }
}
