class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int length=0;
        int zeroCount=0;

        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) zeroCount++;

            while(zeroCount>k){
                if(nums[i]==0){
                    zeroCount--;
                }
                i++;
            }
            length = Math.max(length,j-i+1);
        }
        return length;
    }
}