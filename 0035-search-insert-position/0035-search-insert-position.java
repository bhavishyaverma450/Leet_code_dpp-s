class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int strt = 0;
        int end = n-1;
        while(strt<=end){
            int mid = strt+(end-strt)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                strt = mid+1;
            }else{
                end = mid-1;
            }
        }
        int res=n;
        for(int i=0;i<n;i++){
            if(nums[i]>target){
                res = i;
                break;
            }
        }
        return res;
    }
}