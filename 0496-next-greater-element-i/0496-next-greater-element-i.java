class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums2.length];
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                arr[i]=-1;
                st.push(nums2[i]);
            }else if(st.peek()<nums2[i]){
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    st.pop();
                }
                if(st.isEmpty())arr[i]=-1;
                else arr[i]=st.peek();
                st.push(nums2[i]);
            }else if(st.peek()>nums2[i]){
                arr[i]=st.peek();
                st.push(nums2[i]);
            }
        }
        for(int it:arr){
            System.out.print(it+" ");
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int ele=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(ele==nums2[j]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
}