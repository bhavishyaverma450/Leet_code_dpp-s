import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        int res = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res=i;
                break;
            }
        }
        return res;
    }
}