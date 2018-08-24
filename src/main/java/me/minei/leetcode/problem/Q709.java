package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/to-lower-case/description/
 */
public class Q709 {
    public static void main(String[] args) {
        System.out.println(new Q709().toLowerCase("aaBaa"));
    }
    // two pointers method
    public String toLowerCase(String str) {
        int left = 0, right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left <= right) {
            if (chars[left] >= 65 && chars[left] <= 90) {
                chars[left] += 32;
            }
            if (chars[right] >= 65 && chars[right] <= 90) {
                chars[right] += 32;
            }
            left++; right--;
        }
        return new String(chars);
    }
}
