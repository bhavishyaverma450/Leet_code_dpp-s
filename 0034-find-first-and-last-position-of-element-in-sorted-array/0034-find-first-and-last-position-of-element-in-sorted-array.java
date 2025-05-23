class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res[0]=mid;
                right=mid-1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res[1]=mid;
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        
        
        
        
        
        return res;
        
        
        // int res[] = new int[2];
        // res[0]=-1;
        // res[1]=-1;
        // int n = nums.length;
        // int strt=0;
        // int end=n-1;
        // while(strt<=end){
        //     int mid = strt+(end-strt)/2;
        //     if(nums[mid]==target){
        //         res[0]=mid;
        //         end = mid-1;
        //     }else if(nums[mid]<target){
        //         strt = mid+1;
        //     }else{
        //         end = mid-1;
        //     }
        // }
        // strt=0;
        // end=n-1;
        // while(strt<=end){
        //     int mid = strt+(end-strt)/2;
        //     if(nums[mid]==target){
        //         res[1]=mid;
        //         strt = mid+1;
        //     }else if(nums[mid]<target){
        //         strt = mid+1;
        //     }else{
        //         end = mid-1;
        //     }
        // }
        // return res;
    }
}