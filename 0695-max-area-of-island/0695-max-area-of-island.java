class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int maxArea=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int area=dfs(grid,i,j);
                    maxArea=Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;

        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0)return 0;
        grid[i][j]=0;

        int left=dfs(grid,i,j-1);
        int right=dfs(grid,i,j+1);
        int bottom=dfs(grid,i+1,j);
        int up=dfs(grid,i-1,j);

        return 1+left+right+bottom+up;
    }
}