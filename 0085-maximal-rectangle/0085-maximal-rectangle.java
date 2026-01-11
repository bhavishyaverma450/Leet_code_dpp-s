class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int[] heights = new int[m];
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }else{
                    heights[j]=0;
                }
            }
            maxArea = Math.max(maxArea,solve(heights));
        }
        return maxArea;
    }
    public int solve(int[] heights){
        int n = heights.length,maxArea=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            int current=(i==n)?0:heights[i];
            while(!st.isEmpty() && current<heights[st.peek()]){
                int height = heights[st.pop()];
                int left = (st.isEmpty())?-1:st.peek();
                int width = i-left-1;
                maxArea = Math.max(maxArea,height*width);
            }
            st.push(i);
        }
        return maxArea;
    }
}