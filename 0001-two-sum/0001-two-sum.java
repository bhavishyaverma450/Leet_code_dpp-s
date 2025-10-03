class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int ans1= 0;
        int ans2= 1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[ans1]=i;
                    ans[ans2]=j;
                    break;
                }
            }
        }
        return ans;
    }
}