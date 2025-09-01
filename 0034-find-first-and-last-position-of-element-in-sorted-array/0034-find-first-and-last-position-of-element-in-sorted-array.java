class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        int fp=-1;
        int lp=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                if(mid>0 && nums[mid]==nums[mid-1]){
                    high=mid-1;
                }else{
                    fp=mid;
                    break;
                }
            }
            else if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) low=mid+1;
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                if(mid+1<nums.length && nums[mid+1]==nums[mid]){
                    low = mid+1;
                }else{
                    lp=mid;
                    break;
                }
            }
            else if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) low=mid+1;
        }
        return new int[]{fp,lp};
    }
}