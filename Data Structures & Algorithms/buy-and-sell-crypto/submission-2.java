class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = -1;
        int diff = 0;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            int price = prices[i];
            if(price < cheapest || cheapest == -1){
                cheapest = price;
            }
            if(price > cheapest){
                diff = price - cheapest;
                if(diff > profit){
                    profit = diff;
                }
            }
        }   
        return profit;

    }
}
