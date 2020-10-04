package medium;

public class P0209_MinimumSizeSubarraySum {
    public static void main(String[] args) throws Exception {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0, end = 0, sum = 0, min = Integer.MAX_VALUE;

        while (end < nums.length) {
            sum += nums[end];
            while (sum >= s) {
                min = Math.min(min, end - start + 1);
                sum -= nums[start++];
            }
            end++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
