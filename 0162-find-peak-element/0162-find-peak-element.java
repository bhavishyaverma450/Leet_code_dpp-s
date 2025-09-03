class Solution {
    public int findPeakElement(int[] nums) {
        int peak=Integer.MIN_VALUE;
        int peak_ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>peak){
                peak = nums[i];
                peak_ind = i;
            }
        }
        return peak_ind;
    }
}