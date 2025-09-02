class Solution {
    public boolean search(int[] nums, int target) {
        boolean res = false;
        for(int i:nums){
            if(i==target){
                res=true;
                break;
            }
        }
        return res;
    }
}