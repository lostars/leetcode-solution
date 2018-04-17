package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
public class Q387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    // 时间复杂度O(n) 空间复杂度O(1)
    public static int firstUniqChar(String s) {
        int[] data = new int[26];
        for (int i = 0; i < s.length(); i++) {
            data[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (data[s.charAt(i) - 97] == 1)
                return i;
        }
        return -1;
    }
}
