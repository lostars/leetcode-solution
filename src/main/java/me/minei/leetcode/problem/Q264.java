package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/ugly-number-ii/description/
 *
 * Dynamic Programming
 */
public class Q264 {
    public static void main(String[] args) {
        System.out.println(new Q264().nthUglyNumber(4));
    }

    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        int index = 0;
        for (int i = 1; i <= (n >= 6 ? 6 : n); i++) {
            nums[index++] = i;
        }
        int p2 = 1, p3 = 1, p5 = 1;
        while (n - 1 >= index) {
            int end = nums[index - 1];
            int p22 = nums[p2] * 2;
            int p32 = nums[p3] * 3;
            int p52 = nums[p5] * 5;
            while (p22 <= end) {
                p22 = nums[++p2] * 2;
            }
            while (p32 <= end) {
                p32 = nums[++p3] * 3;
            }
            while (p52 <= end) {
                p52 = nums[++p5] * 5;
            }
            nums[index++] = Math.min(p22, Math.min(p32, p52));
        }
        return nums[n - 1];
    }
}
