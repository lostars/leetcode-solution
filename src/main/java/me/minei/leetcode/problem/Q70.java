package me.minei.leetcode.problem;

public class Q70 {
    public static void main(String[] args) {
        System.out.println(new Q70().climbStairs(4));
    }

    // top-down dp solution
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n + 1; i++) {
            if (i >= 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else if (i >= 1) {
                dp[i] = dp[i - 1];
            }
        }
        return dp[n];
    }
}
