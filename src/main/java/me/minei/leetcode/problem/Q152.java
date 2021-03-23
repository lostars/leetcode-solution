package me.minei.leetcode.problem;

public class Q152 {

    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        System.out.println(new Q152().maxProduct(nums));
        // -2 3 -4
    }

    public int maxProduct(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int product = 1, max = Integer.MIN_VALUE;

            for (int j = i; j >= 0; j--) {
                product *= nums[j];
                max = Math.max(max, product);
            }
            dp[i] = Math.max(dp[i - 1], max);
        }
        return dp[nums.length - 1];
    }
}
