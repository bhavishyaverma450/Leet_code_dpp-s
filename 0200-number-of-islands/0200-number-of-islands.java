class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[] curr=q.poll();
                        int x=curr[0];
                        int y=curr[1];
                        for(int k=0;k<4;k++){
                            int newX=x+dx[k];
                            int newY=y+dy[k];
                            if(newX>=0 && newX<m && newY>=0 && newY<n && grid[newX][newY]=='1'){
                                grid[newX][newY]='0';
                                q.add(new int[]{newX,newY});
                            }
                        }
                    }
                    count++;
                }
            }
        }

        return count;
    }
}