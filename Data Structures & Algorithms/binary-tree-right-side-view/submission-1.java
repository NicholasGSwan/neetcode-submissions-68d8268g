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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Deque<TreeNode> deq = new ArrayDeque<>();
        TreeNode curr = root;
        deq.add(curr);

        while(!deq.isEmpty()){
            int size = deq.size();
            int val = -1;
            while(size > 0){
                curr = deq.removeFirst();
                size--;
                val = curr.val;
                if(curr.left != null){
                    deq.add(curr.left);
                }
                if(curr.right != null){
                    deq.add(curr.right);
                }
            }
            ans.add(val);
        } 
        return ans;
        
    }
}
