package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/rotate-array/description/
 */
public class Q189 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        // 5 2 3 1 4 6 7
        new Q189().rotate(nums, 3);
        for (int n : nums) {
            System.out.print(n + ",");
        }
        System.out.println();
    }

    // 分成两个数组操作
    public void rotate(int[] nums, int k) {
        if (k >= nums.length) k %= nums.length;
        int[] left = new int[k];
        int[] right = new int[nums.length - k];
        System.arraycopy(nums, right.length, left, 0, left.length);
        System.arraycopy(nums, 0, right, 0, right.length);
        System.arraycopy(left, 0, nums, 0, left.length);
        System.arraycopy(right, 0, nums, left.length, right.length);
    }
}
