public class stockProblem {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            // minimum price update
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // profit calculate
            int profit = prices[i] - minPrice;

            // max profit update
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}

