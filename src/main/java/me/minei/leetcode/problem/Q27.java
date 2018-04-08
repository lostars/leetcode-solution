package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/remove-element/description/
 */
public class Q27 {
    public static void main(String[] args) {
        int[] s = {4, 5};
        System.out.println(removeElement(s, 6));
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length, index = 0;
        for (int n : nums) {
            if (val == n) {
                len--;
            } else {
                nums[index++] = n;
            }
        }
        return len;
    }
}