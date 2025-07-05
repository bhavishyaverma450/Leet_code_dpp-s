class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int temp = image[sr][sc];
        image[sr][sc]=color;
        int m = image.length;
        int n = image[0].length;
        if(image[sr][sc]==temp) return image;
        if(sc+1<n && image[sr][sc+1]==temp){
            floodFill(image,sr,sc+1,color);
        }
        if(sc-1>=0 && image[sr][sc-1]==temp){
            floodFill(image,sr,sc-1,color);
        }
        if(sr-1>=0 && image[sr-1][sc]==temp){
            floodFill(image,sr-1,sc,color);
        }
        if(sr+1<m && image[sr+1][sc]==temp){
            floodFill(image,sr+1,sc,color);
        }
        return image;
    }
}