package me.minei.leetcode.problem;

public class Q322 {

    public static void main(String[] args) {
        int[] coins = {2,5,10,1};
        System.out.println(new Q322().coinChange(coins, 27));
        // 1 2 3 4 5 6
        // 1 1 1 2 2 2
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i < dp.length; i++) {
            int coinNum = Integer.MAX_VALUE;
            for (int coin : coins) {
                // 如果当前硬币不够 或者 i-coin的数量无法换出来则跳过使用该硬币
                if (i - coin < 0 || dp[i - coin] == -1) continue;
                coinNum = Math.min(dp[i - coin] + 1, coinNum);
            }
            dp[i] = coinNum == Integer.MAX_VALUE ? -1 : coinNum;
        }
        return dp[amount];
    }
}
