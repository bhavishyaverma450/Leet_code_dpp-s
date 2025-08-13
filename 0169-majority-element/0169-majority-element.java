class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int res = 0;

        if(nums.length>1){
            int count=0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i+1]==nums[i]){
                    count++;
                    if(count>(nums.length/2)-1){
                        res = nums[i];
                        break;
                    }
                }else{
                    count=0;
                }      
            }
        }else{
            res = nums[0];
        }
        return res;
    }
}