class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums2.length];
        int k=nums2.length-1;
        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                res[k]=-1;
                k--;
                st.push(nums2[i]);
            }
            else if(st.peek()>nums2[i]){
                res[k]=st.peek();
                k--;
                st.push(nums2[i]);
            }
            else if(st.peek()<=nums2[i]){
                while(!st.isEmpty() && st.peek()<=nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    res[k]=-1;
                }else{
                    res[k]=st.peek();
                }
                k--;
                st.push(nums2[i]);
            }
        }
        k=0;
        int[] ans = new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<res.length;j++){
                if(nums2[j]==nums1[i]){
                    ans[k]=res[j];
                    k++;
                }
            }
        }
        return ans;
    }
}