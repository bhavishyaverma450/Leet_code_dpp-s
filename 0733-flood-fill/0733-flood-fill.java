class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        
        int t=image[sr][sc];
        if(t==color)return image;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc]=color;

        int[] dx={-1,1,0,0};
        int[] dy={0,0,1,-1};

        while(!q.isEmpty()){
            int[] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int i=0;i<4;i++){
                int newX=x+dx[i];
                int newY=y+dy[i];
                if(newX>=0 && newX<m && newY>=0 && newY<n && image[newX][newY]==t){
                    q.add(new int[]{newX,newY});
                    image[newX][newY]=color;
                }
            }
        }
        return image;
    }
}