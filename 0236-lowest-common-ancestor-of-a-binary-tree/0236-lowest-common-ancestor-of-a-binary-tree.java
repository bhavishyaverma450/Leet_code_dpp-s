/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return root;
        if(p==root || q==root)return root;
        TreeNode leftTree=lowestCommonAncestor(root.left,p,q);
        TreeNode rightTree=lowestCommonAncestor(root.right,p,q);
        return leftTree==null?rightTree:rightTree==null?leftTree:root;
    }
}