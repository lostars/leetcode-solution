package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/house-robber-ii/
 */
public class Q213 {

    public static void main(String[] args) {
        int[] ints = {2,3,2};
        System.out.println(new Q213().rob(ints));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length <= 2) return Math.max(nums[0], nums[1]);

        int[][] s = new int[2][nums.length];

        /*
         * 由于围成了一个圈，所以首尾两个必然不能同时抢，那么就分成了两种情况
         * 1. 第一家抢
         *      在计算中需要注意由于第一家抢了，那么最后一家是肯定不能抢的
         * 2. 第一家不抢
         *      初始化值的时候需要注意由于第一家不需要抢，所以s[1][0]不需要初始化值
         *
         * 使用一个二维数组进行存储，分别计算两种情况的最优解，然后取最大值即可
         */
        s[0][0] = nums[0];
        s[0][1] = Math.max(nums[0], nums[1]);
        s[1][0] = 0;
        s[1][1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            s[0][i] = Math.max(s[0][i - 2] + (i == nums.length - 1 ? 0 : nums[i]), s[0][i - 1]);
            s[1][i] = Math.max(s[1][i - 2] + nums[i], s[1][i - 1]);
        }

        return Math.max(s[0][nums.length - 1], s[1][nums.length - 1]);
    }
}
