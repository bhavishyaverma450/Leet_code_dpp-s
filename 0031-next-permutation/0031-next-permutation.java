class Solution {
    public void nextPermutation(int[] nums) {
        int firstIndex =-1;
        int secondIndex =-1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                firstIndex = i;
                break;
            }
        }
        if(firstIndex == -1){
            reverse(nums,0);
        }else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[firstIndex]){
                    secondIndex = i;
                    break;
                }
            }
            swap(nums,firstIndex,secondIndex);
            reverse(nums,firstIndex+1);
        }
    }
    public void reverse(int[] nums,int start){
        int l = start;
        int h= nums.length-1;
        while(l<=h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}