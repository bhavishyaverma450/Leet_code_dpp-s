class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] df=new int[n];
        Arrays.fill(df,-1);
        return Math.min(minCost(cost,n-1,df),minCost(cost,n-2,df));
    }
    public int minCost(int[] cost,int i,int[] df){
        if(i<0)return 0;
        if(df[i]!=-1)return df[i];
        if(i==0 || i==1)return df[i]=cost[i];
        return df[i]=cost[i]+Math.min(minCost(cost,i-1,df),minCost(cost,i-2,df));
    }
}