package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/move-zeroes/description/
 */
public class Q283 {
    public static void main(String[] args) {

    }
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[index++] = n;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
