class Solution {
    int[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int t:nums)sum+=t;
        if(sum%2!=0)return false;

        dp=new int[nums.length][sum+1];
        for(int[] t:dp)Arrays.fill(t,-1);

        return solve(nums.length-1,sum/2,nums);
    }
    public boolean solve(int ind,int target,int[] nums){
        if(target==0)return true;
        if(ind<0)return false;
        if(dp[ind][target]!=-1)return dp[ind][target]==1;

        boolean take=false;
        if(target>=nums[ind])take=solve(ind-1,target-nums[ind],nums);
        boolean not_take=solve(ind-1,target,nums);

        boolean ans=take||not_take;
        dp[ind][target]=ans?1:0;

        return ans;
    }
}