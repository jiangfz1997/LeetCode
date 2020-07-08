package LinkedList;

import java.util.Stack;
//此题递归方法巧妙，建议复习
public class ReverseLinkedList_0206 {

//    static class Solution {
////     public ListNode reverseList(ListNode head) {
////         ListNode prev = null;
////         ListNode curr = head;
////         while(curr != null){
////             ListNode tmp = curr.next;
////             curr.next  = prev;
////             prev = curr;
////             curr = tmp;
////         }
//
////         return prev;
////     }
        public static class ListNode {
              int val;
              ListNode next;
              ListNode() {}
              ListNode(int val) { this.val = val; }
              ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }

        public static void main(String[] args) {
            //ListNode a = new ListNode(0);
            ListNode next = new ListNode(0);
            ListNode a = next;
            for(int i =1; i < 6; i++){
                next.next = new ListNode(i);
                next = next.next;
            }

            ReverseLinkedList_0206 r = new ReverseLinkedList_0206();
            ListNode end = r.reverseList(a);
            System.out.println(end.val);
        }
}
