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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root==null){
            root=newNode;
            return root;
        }
        insert(root,newNode);
        return root;
    }
    public void insert(TreeNode root,TreeNode newNode){
        if(root.val<newNode.val){
            if(root.right!=null) insert(root.right,newNode);
            else root.right=newNode;
        }else if(root.val>newNode.val){
            if(root.left!=null) insert(root.left,newNode);
            else root.left=newNode;
        }
    }
}