package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/unique-paths/
 */
public class Q62 {

    public static void main(String[] args) {
//        System.out.println(new Q62().uniquePaths(51, 9));
        System.out.println(new Q62().dpUniquePaths(51, 9));
    }

    // m * n space and time usage accepted
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int[][] solutions = new int[m][n];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int left = solutions[i][j - 1] == 0 ? 1 : solutions[i][j - 1];
                int up = solutions[i - 1][j] == 0 ? 1 : solutions[i - 1][j];
                solutions[i][j] = left + up;
            }
        }
        return solutions[m - 1][n - 1];
    }

    // dp top-down time limit exceeded
    public int dpUniquePaths(int m, int n) {
        return dp(new int[m][n], m - 1, n - 1);
    }
    public int dp(int[][] dp, int m, int n) {
        if (dp[m][n] != 0) {
            return dp[m][n];
        }
        if (m == 0 || n == 0) {
            dp[m][n] = 1;
            return 1;
        }
        return dp(dp, m - 1, n) + dp(dp, m, n - 1);
    }
}
