/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func levelOrder(root *TreeNode) [][]int {
    ans :=  make([][]int, 0)
	if root == nil {
		return ans
	}
	q := make([]*TreeNode, 0)
	q = append(q, root)
	l := len(q)

	for l > 0 {
		layer := make([]int, l)
		for i := 0; i < l; i++{
			currNode := q[0]
			layer[i] = currNode.Val
			q = q[1:]
			if currNode.Left != nil {
				q = append(q, currNode.Left)
			}
			if currNode.Right != nil {
				q = append(q, currNode.Right)
			}
		}
		l = len(q)
		ans = append(ans, layer)
	}
	return ans
}
