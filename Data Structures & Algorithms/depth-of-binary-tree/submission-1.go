/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func maxDepth(root *TreeNode) int {
    if root == nil {
		return 0
	}

	max := maxInt(maxDepth(root.Left), maxDepth(root.Right))

	return max +1


}

func maxInt(a, b int) int {
	if a > b{
		return a
	}
	return b
}
