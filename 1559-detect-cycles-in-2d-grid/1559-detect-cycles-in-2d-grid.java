class Solution {
    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j]){
                    if(bfs(grid,i,j,vis))return true;
                }
            }
        }
        return false;
    }
    public boolean bfs(char[][] grid,int sr,int sc,boolean[][] vis){
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc,-1,-1});
        vis[sr][sc]=true;

        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0], c=curr[1];
            int pr=curr[2], pc=curr[3];
            for(int k=0;k<4;k++){
                int nr=r+dr[k];
                int nc=c+dc[k];

                if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==grid[r][c]){
                    if(!vis[nr][nc]){
                        vis[nr][nc]=true;
                        q.add(new int[]{nr,nc,r,c});
                    }else if(nr!=pr && nc!=pc)return true;
                }
            }
        }
        return false;
    }
}