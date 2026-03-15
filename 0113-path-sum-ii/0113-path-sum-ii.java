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
    List<List<Integer>> ans=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new LinkedList<>();
        dfs(root,targetSum,list);
        return ans;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer> list){
        if(root==null)return;
        list.add(root.val);
        if(targetSum==root.val && (root.left==null && root.right==null)){
            ans.add(new ArrayList<>(list));
        }else{
            dfs(root.left,targetSum-root.val,list);
            dfs(root.right,targetSum-root.val,list);
        }
        list.remove(list.size()-1);
    }
}