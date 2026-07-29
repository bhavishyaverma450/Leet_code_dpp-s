class Solution {
    int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        dp=new int[m][m];
        for(int[] t:dp)Arrays.fill(t,Integer.MAX_VALUE);
        return solve(triangle,0,0);
    }
    public int solve(List<List<Integer>> list,int row,int col){
        if(row==list.size()-1){
            return dp[row][col]=list.get(row).get(col);
        }
        if(dp[row][col]!=Integer.MAX_VALUE)return dp[row][col];

        int down=solve(list,row+1,col);
        int diagonal=solve(list,row+1,col+1);

        return dp[row][col]=list.get(row).get(col)+Math.min(down,diagonal);
    }
}