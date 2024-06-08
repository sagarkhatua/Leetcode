package Array;

public class bestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int buyPrice=prices[0];
        int profit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]< buyPrice){
                buyPrice=prices[i];

            }
            else{
                int currentProfit=prices[i]-buyPrice;
                profit=Math.max(currentProfit,profit);
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
