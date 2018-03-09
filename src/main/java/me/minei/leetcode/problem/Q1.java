package me.minei.leetcode.problem;

/**
 * Two sum
 * https://leetcode.com/problems/two-sum/description/
 *
 */
public class Q1 {
    public static void main(String[] args) {
        twoSum(new int[]{1, 4, 50, 22}, 72);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
