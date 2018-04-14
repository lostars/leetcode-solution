package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/add-digits/description/
 */
public class Q258 {

    public int addDigits(int num) {
        int n = num % 9;
        return n != 0 || num == 0 ? n : 9;
    }
}
