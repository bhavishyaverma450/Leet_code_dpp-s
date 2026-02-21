class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] t:dp){
            Arrays.fill(t,-1);
        }
        int ans=solve(coins,n-1,amount,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public int solve(int[] arr,int i,int amount,int[][] dp){
        if(amount==0)return 0;
        if(i<0)return Integer.MAX_VALUE;
        if(dp[i][amount]!=-1)return dp[i][amount];
        int take=Integer.MAX_VALUE;
        if(amount>=arr[i]){
            int temp=solve(arr,i,amount-arr[i],dp);
            if(temp!=Integer.MAX_VALUE){
                take=1+temp;
            }
        }
        int not=solve(arr,i-1,amount,dp);

        return dp[i][amount]=Math.min(take,not);
    }
}