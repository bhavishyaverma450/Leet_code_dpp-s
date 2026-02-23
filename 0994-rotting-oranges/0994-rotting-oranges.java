class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int time=0;
        Queue<int[]> q=new LinkedList<>();
        int freshCount=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1)freshCount++;
            }
        }
        
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};

        while(!q.isEmpty() && freshCount>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int x=curr[0];
                int y=curr[1];
                for(int j=0;j<4;j++){
                    int newX=x+dx[j];
                    int newY=y+dy[j];

                    if(newX>=0 && newX<m && newY>=0 && newY<n && grid[newX][newY]==1){
                        grid[newX][newY]=2;
                        freshCount--;
                        q.add(new int[]{newX,newY});
                    }
                }
            }
            time++;
        }
        return freshCount==0?time:-1;
    }
}