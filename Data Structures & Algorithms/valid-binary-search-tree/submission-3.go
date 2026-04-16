/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func isValidBST(root *TreeNode) bool {
    return valid(root, math.MinInt, math.MaxInt)
}

func valid(node *TreeNode, min, max int) bool {
	if node == nil {
		return true
	}

	if !(min < node.Val && node.Val < max) {
		return false
	}
	return valid(node.Left, min, node.Val) && valid(node.Right, node.Val, max)
}