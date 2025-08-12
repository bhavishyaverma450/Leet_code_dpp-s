class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            while(j<nums.length){
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
                j++;
            }
            i++;
        }
        return new int[]{0,0};
    }
}