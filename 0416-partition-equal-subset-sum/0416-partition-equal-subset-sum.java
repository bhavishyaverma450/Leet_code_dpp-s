class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums)sum+=num;
        if(sum%2!=0)return false;
        return solve(nums,n-1,sum/2);
    }
    public boolean solve(int[] nums,int i,int j){
        if(j==0)return true;
        if(i<0)return false;

        boolean notTake=solve(nums,i-1,j);
        boolean take=false;

        if(j>=nums[i])take=solve(nums,i-1,j-nums[i]);
        return notTake||take;
    }
}