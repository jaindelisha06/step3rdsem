import java.util.*;

class q2 {
    static int maxProfit(int[] prices) {

        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            int currentProfit = prices[i] - min;

            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Maximum Profit = " + maxProfit(prices));
    }
}
