package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 *
 */
public class Q9 {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String origin = String.valueOf(x);
        StringBuilder sb = new StringBuilder(origin);
        sb.reverse();
        return origin.endsWith(sb.toString());
    }
}
