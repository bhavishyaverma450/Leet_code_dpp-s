class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)nums[i]=1;
            else nums[i]=0;
        }
        return check(nums,k)-check(nums,k-1);
    }
    public int check(int[] nums,int k){
        if(k<0)return 0;
        int left=0;
        int ans=0,sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>k && left<nums.length){
                sum-=nums[left++];
            }
            ans+=(right-left+1);
        }
        return ans;
    }
}