package easy;

public class P0121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) throws Exception {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0 ; i < prices.length ; i++){
            minValue = Math.min(minValue,prices[i]);
            maxValue = Math.max(maxValue,prices[i]-minValue);
        }
        return maxValue;
    }
}
