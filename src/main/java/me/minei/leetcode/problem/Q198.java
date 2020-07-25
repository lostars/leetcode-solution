package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/house-robber/
 */
public class Q198 {

    public static void main(String[] args) {
        int[] ints = {1,2,3,1};
        System.out.println(new Q198().rob(ints));
    }

    /*
     * nums = [2,7,9,3,1]
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length <= 2) return Math.max(nums[0], nums[1]);

        nums[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 2] + nums[i], nums[i - 1]);
        }
        return nums[nums.length - 1];
    }
}
