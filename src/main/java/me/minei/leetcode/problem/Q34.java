package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/search-for-a-range/description/
 * runtime complexity O(n)
 */
public class Q34 {
    public static void main(String[] args) {
        int[] s = {5, 7, 7, 8, 8, 10};
        System.out.println(searchRange(s, 8));
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if (nums[start] == target && nums[end] == target) {
                return new int[]{start, end};
            } else {
                if (nums[start] != target) {
                    start++;
                }
                if (nums[end] != target) {
                    end--;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
