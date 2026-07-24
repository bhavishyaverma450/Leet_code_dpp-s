class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(i,j,s)){
                    if(j-i+1>ans.length()){
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    public boolean solve(int i,int j,String s){
        if(i>=j)return true;
        if(s.charAt(i)!=s.charAt(j))return false;
        return solve(i+1,j-1,s);
    }
}