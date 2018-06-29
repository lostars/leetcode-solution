package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/isomorphic-strings/description/
 */
public class Q205 {
    public static void main(String[] args) {
        System.out.println(new Q205().isIsomorphic("ab", "ca"));
    }

    public boolean isIsomorphic(String s, String t) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map[sChar] > 0) {
                if (map[sChar] != tChar) {
                    return false;
                }
            } else {
                map[sChar] = tChar;
            }
        }
        map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map[tChar] > 0) {
                if (map[tChar] != sChar) {
                    return false;
                }
            } else {
                map[tChar] = sChar;
            }
        }
        return true;
    }
}
