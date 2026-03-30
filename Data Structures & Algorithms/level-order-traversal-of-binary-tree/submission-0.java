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
        List<List<Integer>> order = new ArrayList();
        Deque<TreeNode> deq = new ArrayDeque();
        if(root != null){
            deq.addLast(root);
        }
        while(!deq.isEmpty()){
            List<Integer> lev = new ArrayList();
            int size = deq.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = deq.removeFirst();
                lev.add(curr.val);
                if(curr.left != null){
                    deq.addLast(curr.left);
                }
                if(curr.right != null){
                    deq.addLast(curr.right);
                }

            }
            order.add(lev);
        }
        return order;
    }
}
