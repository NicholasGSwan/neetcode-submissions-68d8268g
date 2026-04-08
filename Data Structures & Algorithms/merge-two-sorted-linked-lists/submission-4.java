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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head;
        if (list1.val > list2.val){
            head = list2;
        }else{
            head = list1;
        }

        while(list1 != null && list2 != null){
            if(list2.val >= list1.val){
                ListNode l1n = list1.next;
                while(l1n != null && l1n.val < list2.val){
                    list1 = l1n;
                    l1n = list1.next;
                }
                list1.next = list2;
                list1 = l1n;
                ListNode l2n = list2.next;
                while(l2n != null && list1 != null && l2n.val < list1.val){
                    list2 = l2n;
                    l2n = list2.next;
                }
                if(list1 != null){
                list2.next = list1;
                list2 = l2n;
                }

            }else{
                ListNode l2n = list2.next;
                while(l2n != null && l2n.val < list1.val){
                    list2 = l2n;
                    l2n = list2.next;
                }
                list2.next = list1;
                list2 = l2n;
                ListNode l1n = list1.next;
                while(l1n != null && list2 != null && l1n.val < list2.val){
                    list1 = l1n;
                    l1n = list1.next;
                }
                if(list2 != null){
                list1.next = list2;
                list1 = l1n;
                }

            }
        }
        return head;


    }
}