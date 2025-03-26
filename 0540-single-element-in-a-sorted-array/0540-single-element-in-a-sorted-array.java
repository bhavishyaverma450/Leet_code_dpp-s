class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int element = 0;
        int low = 0;
        int high = n-1;
        while(high>low){
            int mid = low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                low = mid+2;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }
}