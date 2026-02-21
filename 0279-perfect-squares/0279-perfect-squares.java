class Solution {
    public int numSquares(int n) {
        int max=(int)Math.sqrt(n);
        int[] squares=new int[max];
        for(int i=1;i<=max;i++){
            squares[i-1]=i*i;
        }
        int[][] dp=new int[max][n+1];
        for(int[] t:dp){
            Arrays.fill(t,-1);
        }
        return solve(squares,squares.length-1,n,dp);
    }
    public int solve(int[] arr,int i,int sum,int[][] dp){
        if(sum==0)return 0;
        if(i<0)return Integer.MAX_VALUE;
        if(dp[i][sum]!=-1)return dp[i][sum];

        int take=Integer.MAX_VALUE;
        if(sum>=arr[i]){
            int temp=solve(arr,i,sum-arr[i],dp);
            if(temp!=Integer.MAX_VALUE){
                take=1+temp;
            }
        }
        int not=solve(arr,i-1,sum,dp);
        return dp[i][sum]=Math.min(take,not);
    }
}