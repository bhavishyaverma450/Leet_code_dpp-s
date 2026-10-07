class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref=new int[nums.length];
        int[] suff=new int[nums.length];
        pref[0]=1;
        suff[nums.length-1]=1;

        for(int i=1;i<pref.length;i++){
            pref[i]=pref[i-1]*nums[i-1];
        }
        for(int i=pref.length-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=suff[i]*pref[i];
        }
        return nums;
    }
}