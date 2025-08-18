import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums){
            hs.add(num);
        }
        int longest=0;
        for(int num: hs){
            if(!hs.contains(num-1)){
                int count=1;
                int curr=num;
                while(hs.contains(curr+1)){
                    count++;
                    curr++;
                }
                longest= Math.max(longest,count);
            }
        }
        return longest;
    }
}