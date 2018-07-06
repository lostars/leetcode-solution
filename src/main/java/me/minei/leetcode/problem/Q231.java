package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/power-of-two/description/
 */
public class Q231 {
    public static void main(String[] args) {
        System.out.println(new Q231().isPowerOfTwo(3));
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
