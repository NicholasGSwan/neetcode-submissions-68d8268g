/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func goodNodes(root *TreeNode) int {
    return countGoodNodes(root.Val, root.Left) + countGoodNodes(root.Val, root.Right) +1
}

func countGoodNodes(t int, currNode *TreeNode) int {
	if currNode == nil {
		return 0
	}

	if currNode.Val < t {
		return countGoodNodes(t, currNode.Left) + countGoodNodes(t, currNode.Right)
	}
	t = maxInt(currNode.Val, t)
	return countGoodNodes(t, currNode.Left) + countGoodNodes(t, currNode.Right) + 1

}

func maxInt(a, b int) int{
	if a > b{
		return a
	}
	return b
}
