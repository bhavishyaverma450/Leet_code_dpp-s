class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums)sum+=num;
        Boolean[][] dp=new Boolean[n][sum+1];
        if(sum%2!=0)return false;
        return solve(nums,n-1,sum/2,dp);
    }
    public boolean solve(int[] nums,int i,int j,Boolean[][] dp){
        if(j==0)return true;
        if(i<0)return false;

        if(dp[i][j]!=null)return dp[i][j];
        boolean notTake=solve(nums,i-1,j,dp);
        boolean take=false;

        if(j>=nums[i])take=solve(nums,i-1,j-nums[i],dp);
        return dp[i][j]=notTake||take;
    }
}