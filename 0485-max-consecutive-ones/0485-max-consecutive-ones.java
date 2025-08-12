class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes =0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
            }else{
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes,temp);
                temp=0;
            }
        }
        return Math.max(maxConsecutiveOnes,temp);
    }
}