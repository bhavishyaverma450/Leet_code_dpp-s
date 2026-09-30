class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids){
            if(a>0){
                st.push(a);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<(-a)){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(a);
                }else if(st.peek()==(-a)){
                    st.pop();
                }
            }
        }
        int[] ans=new int[st.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=st.pop();
        }
        reverse(ans,0,ans.length-1);
        return ans;
    }
    public void reverse(int[] ans,int i,int j){
        while(i<=j){
            int temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;j--;
        }
    }
}