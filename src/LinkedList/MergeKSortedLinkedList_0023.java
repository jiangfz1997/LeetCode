package LinkedList;

public class MergeKSortedLinkedList_0023 {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length == 0) return null;
            int last = lists.length-1;
            if(last == 0) return lists[0];
            while(last > 0){
                int i = 0, j = last;
                while(i  < j){
                    lists[i] = merge(lists[i++], lists[j--]);
                    if(i >= j) last = j;
                }
            }
            return lists[0];
        }

        public ListNode merge(ListNode l1, ListNode l2){
            ListNode dummyHead = new ListNode(0);
            ListNode tail = dummyHead;
            while(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    tail.next = l1;
                    tail = tail.next;
                    l1 = l1.next;
                }else{
                    tail.next = l2;
                    tail = tail.next;
                    l2 = l2.next;
                }
            }
            if(l1 == null){
                tail.next = l2;
                tail = tail.next;
            }else{
                tail.next = l1;
                tail = tail.next;
            }
            return dummyHead.next;
        }
    }
}
