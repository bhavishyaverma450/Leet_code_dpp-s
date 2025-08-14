class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int posIndex =0;
        int negIndex =1;

        for(int num:nums){
            if(num>0){
                res[posIndex] = num;
                posIndex += 2;
            }else{
                res[negIndex] = num;
                negIndex +=2;
            }
        }
        return res;
    }
}