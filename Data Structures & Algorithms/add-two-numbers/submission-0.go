/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	ans := l1
	prev := l1
	r := 0
	for l1 != nil && l2 != nil {
		v := l1.Val + l2.Val +r
		r = 0
		if v > 9 {
			v = v-10
			r++
		}
		l1.Val = v
		prev = l1
		l1 = l1.Next
		l2 = l2.Next
	}

	if l2 != nil {
		val := l2.Val +r
		r = 0
		if val > 9 {
			val = val - 10
			r++
		}
		l2.Val = val
		prev.Next = l2
		prev = prev.Next
		l1 = prev.Next
	}
	
	
	for r != 0 {
		if l1 == nil {
			l1 = &ListNode{Val:1}
			prev.Next = l1
			r = 0
		}else{
			v := l1.Val + r
			r = 0
			if v > 9 {
				v = v -10
				r++
			}
			l1.Val = v
			prev = l1
			l1 = l1.Next
		}
	}



	return ans
    
}
