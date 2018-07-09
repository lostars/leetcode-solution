package me.minei.leetcode.problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 */
public class Q215 {
    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
