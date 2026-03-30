/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;

        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.removeLast();
            ans.add(curr.val);
            curr = curr.right;
        }

        return ans;

        
    }

    public List<Integer> inorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);

        return list;
    }
}