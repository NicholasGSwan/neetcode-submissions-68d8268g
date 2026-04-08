/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        int idx = len(head) - n;
        ListNode prev = null;
        for(int i = 0; i < idx; i++ ){
            prev = dummy;
            dummy = dummy.next;
        }
        if (prev == null) {
            return dummy.next;
        }

        prev.next = dummy.next;
        return head;

    }

    public int len(ListNode head){
        int l = 0;
        while( head != null) {
            l++;
            head = head.next;
        }
        return l;
    }
}
