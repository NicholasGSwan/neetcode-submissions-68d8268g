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
    public int kthSmallest(TreeNode root, int k) {
        Deque<Integer> s = new ArrayDeque<Integer>();
        s = getStack(root, s);
        int ans = -1;
        while(k > 0){
            ans = s.removeFirst();
            k--;
        }
        return ans;
    }

    public Deque<Integer> getStack(TreeNode root, Deque<Integer> s){
        if(root == null){
            return s;
        }

            getStack(root.left, s);
            s.addLast(root.val);
            getStack(root.right, s);


        return s;
    }


}
