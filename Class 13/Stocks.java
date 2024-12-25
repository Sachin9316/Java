public class Stocks {

  public static void buySell(int prices[]) {
    int buy = Integer.MAX_VALUE;
    int MaxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (buy < prices[i]) {
        int Profit = prices[i] - buy;
        MaxProfit = Math.max(MaxProfit, Profit);
      } else {
        buy = prices[i];
      }
    }
    System.out.println("Maximum profit is  : " + MaxProfit);
  }

  public static void main(String[] args) {
    int prices[] = { 7, 1, 5, 3, 6, 4 };
    buySell(prices);
  }
}
