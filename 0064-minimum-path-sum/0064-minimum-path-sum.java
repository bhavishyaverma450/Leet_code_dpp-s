class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length-1;
        int n=grid[0].length-1;
        int[][] dp=new int[m+1][n+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return pathSum(grid,dp,m,n);
    }
    public int pathSum(int[][] grid,int[][] dp,int i,int j){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==0 && j==0)return dp[i][j]=grid[i][j];
        if(i==0 && j!=0)return dp[i][j]=grid[i][j]+pathSum(grid,dp,0,j-1);
        if(i!=0 && j==0)return dp[i][j]=grid[i][j]+pathSum(grid,dp,i-1,0);
        return dp[i][j]=grid[i][j]+Math.min(pathSum(grid,dp,i,j-1),pathSum(grid,dp,i-1,j));
    }
}