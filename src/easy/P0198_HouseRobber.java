package easy;

public class P0198_HouseRobber {
    public static void main(String[] args) throws Exception {
        System.out.println(rob(new int[]{2,1,1,2}));
    }

    public static int rob(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);
        int maxValue = 0;
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i],dp[i-1]);
            maxValue = Math.max(maxValue, dp[i]);
        }
        return maxValue;
    }
}
