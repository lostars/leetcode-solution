package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class Q338 {

    public static void main(String[] args) {
        new Q338().countBits(16);
    }

    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            /*
             * 偶数1的个数等于 i/2 1的个数 相当于右移一位，并未增加1的个数
             * 奇数情况则是前一个数字1的个数 +1
             */
            dp[i] = i % 2 == 0 ? dp[i / 2] : dp[i - 1] + 1;
            /*
             * 另一个解法：当前1的个数等于右移一位的数字1的个数，同时由于右移了一位，可能会少一个1，取余或者与操作来计算末位是否为1
             * dp[i] = dp[i >> 1] + (i & 1) 或者 dp[i] = dp[i >> 1] + i % 2
             */
        }
        return dp;
    }
}
