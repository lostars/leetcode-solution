package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/minimum-path-sum/
 */
public class Q64 {

    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(new Q64().minPathSum(grid));
    }

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                /*
                 * dp[][] 表示从左上角到相应位置的最小和
                 * 第一行和第一列的位置最小和就是求和即可
                 * 其他数据获取最小和 dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]
                 */
                if (i == 0) dp[0][j] = j == 0 ? grid[0][j] : grid[0][j] + dp[0][j - 1];
                else if (j == 0) dp[i][0] = grid[i][0] + dp[i - 1][0];
                else dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }

    public int minPathSumWithoutExtraMemory(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0) grid[0][j] = j == 0 ? grid[0][j] : grid[0][j] + grid[0][j - 1];
                else if (j == 0) grid[i][0] = grid[i][0] + grid[i - 1][0];
                else grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
