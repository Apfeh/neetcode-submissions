class Solution {
    public int maxProfit(int[] prices) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int cheapest = -1;
        int diff = 0;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            indexMap.put(i, prices[i]);
        }   
        for (Map.Entry<Integer, Integer> entry: indexMap.entrySet()){
            
            if(entry.getValue() < cheapest || cheapest == -1){
                cheapest = entry.getValue();
            }
            if(entry.getValue() > cheapest){
                diff = entry.getValue() - cheapest;
                if(diff > profit){
                    profit = diff;
                }
            }
        }
        return profit;

    }
}
