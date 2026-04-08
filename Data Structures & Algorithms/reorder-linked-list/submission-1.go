/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func reorderList(head *ListNode) {

    lastNode := head
    //length := 1

    for lastNode.Next != nil {
        //length++
        lastNode = lastNode.Next
    }

    //length = length/3 + 1
    currNode := head
    //cnt := 0
    for currNode != lastNode{
        secLastNode := currNode
        for secLastNode.Next != lastNode {
            secLastNode = secLastNode.Next
        }
        if currNode == secLastNode {
            break
        }
        tmp := currNode.Next
        currNode.Next = lastNode
        lastNode.Next = tmp
        currNode = tmp

        lastNode = secLastNode
        lastNode.Next = nil
        //cnt++
    }

    
}
