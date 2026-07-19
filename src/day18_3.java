public class day18_3 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int mini = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - mini;
            //profit=Math.max(profit,cost);
            if (profit < cost) {
                profit = cost;
            }
            if (mini > prices[i]) {
                mini = prices[i];
            }

        }
        System.out.println(profit);
        System.out.println(mini);
    }
}
