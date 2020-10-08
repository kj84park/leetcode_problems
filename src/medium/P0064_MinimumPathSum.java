package medium;

public class P0064_MinimumPathSum {
    public static void main(String[] args) throws Exception {
        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    public static int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int row = grid.length;
        int column = grid[0].length;

        int[][] dp = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j-1]+grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j]+grid[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j]+grid[i][j], dp[i][j - 1]+grid[i][j]);
                }
            }
        }
        return dp[row - 1][column - 1];
    }
}
