class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum=nums[0];
        int sum=nums[0];

        for(int i=1;i<nums.length;i++){
            curr_sum=Math.max(nums[i],curr_sum+nums[i]);
            sum=Math.max(sum,curr_sum);
        }
        return sum;
    }
}