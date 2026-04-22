/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Next *Node
 *     Random *Node
 * }
 */

func copyRandomList(head *Node) *Node {
    curr := head
	currCopy := &Node{}
	m := make(map[*Node]*Node)
	for curr != nil {
		currCopy.Val = curr.Val
		m[curr] = currCopy

		curr = curr.Next
		if curr != nil {
			currCopy.Next = &Node{}
			currCopy = currCopy.Next
		}
	}
	curr = head
	currCopy = m[curr]

	for curr != nil {
		if curr.Random != nil {
			currCopy.Random = m[curr.Random]
		}
		curr = curr.Next
		currCopy = currCopy.Next
	}

	return m[head]
}
