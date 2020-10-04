package easy;

public class P0746_MinCostClimbingStairs {
    public static void main(String[] args) throws Exception {
        System.out.println(minCostClimbingStairs(new int[]{0, 1, 1, 0}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }

        if (cost.length == 1) {
            return cost[0];
        }

        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i], dp[i - 1] + cost[i]);
        }

        return Math.min(dp[cost.length - 2], dp[cost.length - 1]);
    }
}
