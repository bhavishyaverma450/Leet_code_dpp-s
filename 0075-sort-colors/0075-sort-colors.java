class Solution {
    public void sortColors(int[] nums) {
        int count=0;
        int temp=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==count){
                temp = nums[index];
                nums[index++]=nums[i];
                nums[i]= temp;
            }
        }
        count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==count){
                temp=nums[index];
                nums[index++]=nums[i];
                nums[i]=temp;
            }
        }
    }
}