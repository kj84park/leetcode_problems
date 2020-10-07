package medium;

public class P0063_UniquePaths2 {
    public static void main(String[] args) throws Exception {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid == null) {
            return 0;
        }

        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
                break;
            } else {
                dp[i][0] = 1;
            }
        }

        for (int j = 0; j < m; j++) {
            if (obstacleGrid[0][j] == 1) {
                dp[0][j] = 0;
                break;
            } else {
                dp[0][j] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];

            }
        }

        return dp[n - 1][m - 1];
    }

}
