package easy;

public class P0053_MaximumSubarray {
    public static void main(String[] args) throws Exception {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxValue = dp[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (Math.max(dp[i - 1], 0));
            maxValue = Math.max(dp[i], maxValue);
        }

        return maxValue;
    }
//    public static int maxSubArray(int[] nums) {
//        int sum = 0;
//        int maxValue = Integer.MIN_VALUE;
//        int end = 0;
//        while (end < nums.length) {
//            if (sum < 0) {
//                sum = nums[end];
//            } else {
//                sum += nums[end];
//            }
//            maxValue = Math.max(sum, maxValue);
//            end++;
//        }
//
//        return maxValue;
//    }
}
