class Solution {
    public void nextPermutation(int[] nums) {
        int firstIndex=-1;
        int secondIndex=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                firstIndex=i;
                break;
            }
        }
        if(firstIndex==-1)reverse(nums,0,nums.length-1);
        else{
            for(int i=nums.length-1;i>=firstIndex;i--){
                if(nums[i]>nums[i-1]){
                    secondIndex=i;
                    break;
                }
            }
            reverse(nums,firstIndex,secondIndex);
        }
    }
    public void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
}