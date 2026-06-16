import java.util.*;
public class StockProfit {
    public int MaxProfit (int[] prices) {
        int n = prices.length;
        int profit = 0;
        int buy = prices[0];
        for(int i=1; i<n; i++) {
            if( buy > prices[i]) {
                buy = prices[i];
            } else if(prices[i] - buy > profit) {
                profit = prices[i] - buy;
            } 
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        StockProfit sp = new StockProfit();
        int result = sp.MaxProfit(arr);
        System.out.println("the maximum profit is:"+result);
    }
}
