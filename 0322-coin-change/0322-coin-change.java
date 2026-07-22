class Solution {
    int[][] dp;
    public int coinChange(int[] coins, int amount) {
        dp=new int[coins.length][amount+1];
        for(int[] t:dp)Arrays.fill(t,-1);
        int ans=solve(coins.length-1,coins,amount);

        return ans>=1000000000?-1:ans;
    }
    public int solve(int ind,int[] coins,int amount){
        if(amount==0)return dp[ind][amount]=0;
        if(ind<0)return 1000000000;
        if(dp[ind][amount]!=-1)return dp[ind][amount];

        int take=1000000000;
        if(amount>=coins[ind]){
            take=1+solve(ind,coins,amount-coins[ind]);
        }
        int not_take=solve(ind-1,coins,amount);
        return dp[ind][amount]=Math.min(take,not_take);
    }
}