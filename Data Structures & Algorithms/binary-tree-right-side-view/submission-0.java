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
        Deque<TreeNode> deq = new ArrayDeque();
        List<Integer> rs = new ArrayList();
        if(root != null){
            deq.addLast(root);
        }
        while(!deq.isEmpty()){
            int size = deq.size();
            TreeNode curr =null;
            for(int i = 0; i < size; i++){
                curr = deq.removeFirst();
                if(curr.left != null){
                    deq.addLast(curr.left);
                }
                if(curr.right != null){
                    deq.addLast(curr.right);
                }
            }
            rs.add(curr.val);
        }
        return rs;
    }
}
