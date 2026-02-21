class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] t:dp){
            Arrays.fill(t,-1);
        }
        return solve(coins,n-1,amount,dp);
    }
    public int solve(int[] arr,int i,int sum,int[][] dp){
        if(sum==0)return 1;
        if(i<0)return 0;
        if(dp[i][sum]!=-1)return dp[i][sum];
        int take=0;
        if(sum>=arr[i]){
            take=solve(arr,i,sum-arr[i],dp);
        }
        int not=solve(arr,i-1,sum,dp);

        return dp[i][sum]=take+not;
    }
}