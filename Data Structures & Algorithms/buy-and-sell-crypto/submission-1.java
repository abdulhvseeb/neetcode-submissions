class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int difference;

        for(int i= 0; i < prices.length;i++) {

            if(prices[i] < min) {
                min = prices[i];

            }

            difference = prices[i] - min;

            if(difference > maxProfit) {
                maxProfit = difference;
            }


        }

        return maxProfit;



        
    }
}
