class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length()-1;
        int n=text2.length()-1;
        int[][] dp=new int[m+1][n+1];
        for(int[] t:dp){
            Arrays.fill(t,-1);
        }
        return sb(text1,text2,dp,m,n);
    }
    public int sb(String text1,String text2,int[][] dp,int i,int j){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j))return dp[i][j]=1+sb(text1,text2,dp,i-1,j-1);
        return dp[i][j]=Math.max(sb(text1,text2,dp,i-1,j),sb(text1,text2,dp,i,j-1));
    }
}