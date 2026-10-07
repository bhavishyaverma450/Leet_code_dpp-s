class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,1);
        int curr=1;
        for(int i=0;i<ans.length;i++){
            ans[i]*=curr;
            curr*=nums[i];
        }
        curr=1;
        for(int i=ans.length-1;i>=0;i--){
            ans[i]*=curr;
            curr*=nums[i];
        }
        return ans;
    }
}