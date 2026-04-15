class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        boolean[][] vis=new boolean[m][n];
        int[][] dis=new int[m][n];
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    vis[i][j]=true;
                    q.add(new int[]{i,j,0});
                }
            }
        }
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            int d=curr[2];
            dis[x][y]=d;
            for(int i=0;i<4;i++){
                int newX=x+dx[i];
                int newY=y+dy[i];
                if(newX>=0 && newY>=0 && newX<m && newY<n && !vis[newX][newY]){
                    vis[newX][newY]=true;
                    q.add(new int[]{newX,newY,d+1});
                }
            }
        }
        return dis;
    }
}