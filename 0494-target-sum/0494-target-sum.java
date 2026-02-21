class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,nums.length-1,0,target);
    }
    public int solve(int[] nums,int i,int sum,int target){
        if(i<0){
            if(sum==target)return 1;
            return 0;
        }
        int plus=solve(nums,i-1,sum+nums[i],target);
        int minus=solve(nums,i-1,sum-nums[i],target);

        return plus+minus;
    }
}