class Solution {
    int[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int t:nums)sum+=t;
        if(sum%2!=0)return false;
        int target=sum/2;
        dp=new int[nums.length][target+1];
        for(int[] t:dp){
            Arrays.fill(t,-1);
        }
        return solve(nums.length-1,nums,target);
    }
    public boolean solve(int ind,int[] nums,int target){
        if(target==0)return false;
        if(ind==0){
            return nums[0]==target;
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target]==1;
        }
        boolean not_take=solve(ind-1,nums,target);
        boolean take=false;
        if(target>=nums[ind]){
            take=solve(ind-1,nums,target-nums[ind]);
        }
        dp[ind][target]=(take||not_take)?1:0;

        return take||not_take;
    }
}