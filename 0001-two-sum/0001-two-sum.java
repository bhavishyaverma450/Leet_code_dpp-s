class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        for(int i=0;i<nums.length-1;i++){
            int ele = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==ele){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }
}