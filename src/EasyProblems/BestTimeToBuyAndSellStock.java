package EasyProblems;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {2,1,2,1,0,1,3};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0, left = 0, right = 1;

        while (right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                if(profit > maxProfit) maxProfit = profit;
            } else {
                left = right;
            }
            right += 1;
        }
        return maxProfit;
    }
}
