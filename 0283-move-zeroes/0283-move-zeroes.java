class Solution {
    public void moveZeroes(int[] nums) {
        int nzi =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=nzi){
                    int temp = nums[i];
                    nums[i] = nums[nzi];
                    nums[nzi] = temp;
                }
                nzi++;
            }
        }
    }
}