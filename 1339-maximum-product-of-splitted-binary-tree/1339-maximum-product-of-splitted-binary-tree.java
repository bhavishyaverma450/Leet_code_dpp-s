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
    long total=0,best=0;
    static final int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {
        total = sum(root);
        dfs(root);
        return (int)(best%MOD);
    }
    public long sum(TreeNode root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public long dfs(TreeNode root){
        if(root==null)return 0;
        long s  = root.val+dfs(root.left)+dfs(root.right);
        best = Math.max(best,s*(total-s));
        return s;
    }
}