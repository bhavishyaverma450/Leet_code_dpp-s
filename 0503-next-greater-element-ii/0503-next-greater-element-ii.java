import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];
        int k = nums.length-1;

        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                st.pop();
            }
            if(i<nums.length){
                res[k] = st.isEmpty()?-1:st.peek();
                k--;
            }
            st.push(nums[i%nums.length]);
        }
        return res;
    }
}