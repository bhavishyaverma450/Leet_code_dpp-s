class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(dp,n);
    }
    public int fun(int[] dp,int n){
        if(n==0)return dp[n]=1;
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int x=fun(dp,n-1);
        int y=fun(dp,n-2);
        return dp[n]=x+y;
    }
}