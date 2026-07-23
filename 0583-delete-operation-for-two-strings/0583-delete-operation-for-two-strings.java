class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        dp=new int[m][n];
        for(int[] t:dp)Arrays.fill(t,-1);
        return m+n-2*lcs(m-1,n-1,word1,word2);
    }
    public int lcs(int i,int j,String s1,String s2){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))return dp[i][j]=1+lcs(i-1,j-1,s1,s2);
        return dp[i][j]=Math.max(lcs(i-1,j,s1,s2),lcs(i,j-1,s1,s2));
    }
}