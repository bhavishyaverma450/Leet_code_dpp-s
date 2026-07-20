class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums.length-1,nums,0,target);
    }
    public int solve(int ind,int[] nums,int sum,int target){
        if(ind<0){
            if(sum==target)return 1;
            return 0;
        }
        int take=solve(ind-1,nums,sum+nums[ind],target);
        int not_take=solve(ind-1,nums,sum-nums[ind],target);
        return take+not_take;
    }
}