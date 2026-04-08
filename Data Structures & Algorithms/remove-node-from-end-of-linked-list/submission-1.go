/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func removeNthFromEnd(head *ListNode, n int) *ListNode {
    dummy := head
    ind := length(head) - n
    var prev *ListNode
    for i := 0; i < ind; i++ {
        prev = dummy
        dummy = dummy.Next
    }

    if prev == nil {
        return dummy.Next
    }
    prev.Next = dummy.Next
    return head


}

func length(head *ListNode) int {
    l := 0
    for head != nil {
        l++
        head = head.Next
    }
    return l
}
