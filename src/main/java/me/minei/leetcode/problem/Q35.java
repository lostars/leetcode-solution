package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/search-insert-position/description/
 * 注意是有序数组，所以循环一次即可
 */
public class Q35 {
    public static void main(String[] args) {
        int[] s = {1,3,5,6};
        System.out.println(searchInsert(s, 0));
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target) {
                return i + 1;
            }
        }

        return 0;
    }
}
