class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int arr[],int last,int max){
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}