public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0, buy = prices[0];

        for(int i = 0; i < prices.length; i++) {
            if(buy > prices[i]) {
                buy = prices[i];
            }
            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(" Profit : "+ maxProfit(prices));
    }
}
