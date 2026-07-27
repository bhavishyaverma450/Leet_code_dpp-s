class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        dp=new int[m][n];
        for(int[] it:dp)Arrays.fill(it,-1);

        return solve(obstacleGrid,0,0);
    }
    public int solve(int[][] arr,int i,int j){
        if(i>=arr.length || j>=arr[0].length)return 0;
        if(arr[i][j]==1)return dp[i][j]=0;
        if(i==arr.length-1 && j==arr[0].length-1)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        
        int right=solve(arr,i,j+1);
        int bottom=solve(arr,i+1,j);

        return dp[i][j]=right+bottom;
    }
}