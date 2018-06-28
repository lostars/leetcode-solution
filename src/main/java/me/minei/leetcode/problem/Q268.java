package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/missing-number/description/
 */
public class Q268 {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
