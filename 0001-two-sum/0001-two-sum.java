class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
                j++;
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}