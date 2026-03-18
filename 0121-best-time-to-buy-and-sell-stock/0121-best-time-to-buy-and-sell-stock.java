class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            int sell=prices[i];
            if(sell<buy)buy=sell;
            profit=Math.max(profit,sell-buy);
        }
        return profit;
    }
}