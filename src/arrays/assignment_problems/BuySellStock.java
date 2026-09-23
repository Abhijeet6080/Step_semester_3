package arrays.assignment_problems;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BuySellStock solution = new BuySellStock();
        
        // Sample Input 1
        int profit1 = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println("Test 1 max profit: " + profit1);

        // Sample Input 2
        int profit2 = solution.maxProfit(new int[]{7, 6, 4, 3, 1});
        System.out.println("Test 2 max profit: " + profit2);
    }
}