/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func diameterOfBinaryTree(root *TreeNode) int {
    if root == nil {
		return 0
	}

	branchMax := maxInt(diameterOfBinaryTree(root.Left),diameterOfBinaryTree(root.Right))
	max := maxInt(maxDepth(root.Left) + maxDepth(root.Right), branchMax)

	return max
}

func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	
	max := maxInt(maxDepth(root.Left), maxDepth(root.Right))

	return max+1
}

func maxInt(a, b int) int {
	if a>b{
		return a
	}
	return b
}
