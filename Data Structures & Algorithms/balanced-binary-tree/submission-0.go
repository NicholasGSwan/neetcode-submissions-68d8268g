/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func isBalanced(root *TreeNode) bool {
    if root == nil {
		return true
	}

	childrenBalanced := isBalanced(root.Left) && isBalanced(root.Right)

	limbDif := absolute(maxDepth(root.Left) - maxDepth(root.Right))

	return childrenBalanced && limbDif<2

}

func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}

	max := maxInt(maxDepth(root.Left),maxDepth(root.Right))

	return max + 1
}

func absolute(c int) int {

	if c > 0 {
		return c
	}
	return c*-1
}


func maxInt(a,b int) int{
	if a>b{
		return a
	}
	return b
}
