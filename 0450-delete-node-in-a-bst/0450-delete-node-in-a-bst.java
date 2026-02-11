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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val>key)root.left=deleteNode(root.left,key);
        else if(root.val<key)root.right=deleteNode(root.right,key);
        else{
            if(root.left==null && root.right==null)return null;
            else if(root.left!=null && root.right==null)return root.left;
            else if(root.left==null && root.right!=null)return root.right;
            TreeNode curr=findMax(root.left);
            root.val=curr.val;
            root.left=deleteNode(root.left,curr.val);
        }
        return root;
    }
    public TreeNode findMax(TreeNode root){
        while(root.right!=null)root=root.right;
        return root;
    }
}