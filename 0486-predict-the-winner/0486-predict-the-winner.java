class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(0,nums.length-1,nums)>=0;
    }
    public int solve(int i,int j,int[] nums){
        if(i==j)return nums[i];
        int left=nums[i]-solve(i+1,j,nums);
        int right=nums[j]-solve(i,j-1,nums);

        return Math.max(left,right);
    }
}