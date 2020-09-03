package LinkedList;

import Tree.TreeNode;

public class ConvertSortedLinkedListToBST_0109 {
    public TreeNode sortedListToBST(ListNode head) {

        if(head == null || head.next == null)
            return head == null ? null : new TreeNode(head.val);

        return helper(head, null);


    }
    public TreeNode helper(ListNode head, ListNode end){
        if(head == null || head == end)
            return null;
        ListNode p = head;
        ListNode q = head;
        while(p != end && p.next != end){
            p = p.next.next;
            q = q.next;
        }
        if(p == q) return new TreeNode(p.val);
        TreeNode root = new TreeNode(q.val);

        root.left = helper(head, q);
        root.right = helper(q.next, end);
        return root;
    }
}
