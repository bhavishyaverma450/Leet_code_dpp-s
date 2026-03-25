class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;

        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void dfs(int[][] image,int i,int j,int color,int val){
        int m=image.length;
        int n=image[0].length;
        
        if(i<0 || i>=m || j<0 || j>=n || image[i][j]!=val)return;
        image[i][j]=color;

        dfs(image,i-1,j,color,val);
        dfs(image,i+1,j,color,val);
        dfs(image,i,j-1,color,val);
        dfs(image,i,j+1,color,val);
    }
}