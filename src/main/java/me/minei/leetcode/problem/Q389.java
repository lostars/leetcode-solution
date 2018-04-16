package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/find-the-difference/description/
 */
public class Q389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "dbcae"));
    }
    // 其实就是异或运算，Q136的变种
    public static char findTheDifference(String s, String t) {
        char result = 0;
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
        result ^= t.charAt(t.length() - 1);
        return result;
    }
}
