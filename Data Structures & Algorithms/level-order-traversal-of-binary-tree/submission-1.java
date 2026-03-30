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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeNode curr = root;
        Deque<TreeNode> deq = new ArrayDeque<>();
        if(curr != null){
            deq.add(curr);
        }
        

        while(!deq.isEmpty()){
            int deqSize = deq.size();
            List<Integer> layer = new ArrayList<>();
            while(deqSize > 0){
                curr = deq.removeFirst();
                deqSize--;
                layer.add(curr.val);
                if(curr.left != null){
                    deq.add(curr.left);
                }
                if(curr.right != null){
                    deq.add(curr.right);
                }
            }
            ans.add(layer);
        }
        return ans;
    }
}
