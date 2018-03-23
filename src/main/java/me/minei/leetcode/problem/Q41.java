package me.minei.leetcode.problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/first-missing-positive/description/
 * 必须从1开始
 */
public class Q41 {
    public static void main(String[] args) {
        int[] s = {4,1,2,3};
        System.out.println(firstMissingPositive(s));
    }
    public static int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int min = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num > 0 && (min == 0 || num < min)) {
                if (min == 0 && num > 1) {
                    return 1;
                }
                min = num;
            }
            if (num <= 0) continue;
            if (num - min == 1) {
                min++; continue;
            }
            if (num - min == 2) {
                return ++min;
            }
        }
        return ++min;
    }
}
