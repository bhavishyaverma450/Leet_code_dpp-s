class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int []ans = new int[n];
        for(int i=0;i<n;i++)
        {
            int wealth = 0;
            for(int j=0;j<m;j++)
            {
                wealth += accounts[i][j];
            }
            ans[i]=wealth;
        }
        int max_wealth = ans[0];
        for(int i=1;i<n;i++)
        {
            if(ans[i]>max_wealth)
            {
                max_wealth = ans[i];
            }
        }
    return max_wealth;
    }
}