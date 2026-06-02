class Solution {
    public int maxProfit(int[] prices) {
       int left = 0, profit = 0;

       for(int right = 1; right < prices.length; right++){

        if(prices[right] > prices[left]){
            int currentProfit = prices[right] - prices[left];
            profit = Math.max(currentProfit, profit);
        } else {
            left = right;
        }
       }
       return profit;
}
    }

    

