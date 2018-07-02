package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/repeated-substring-pattern/description/
 */
public class Q459 {
    public static void main(String[] args) {
        System.out.println(new Q459().repeatedSubstringPattern("abcabcabc"));
    }

    public boolean repeatedSubstringPattern1(String s) {
        for (int i = 0; i < s.length(); i++) {


        }

        return false;
    }

    public boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == s.charAt(i) && i > 0 && s.length() % i == 0) {
                if ("".equals(s.replace(s.substring(0, i), ""))) {
                    return true;
                }
            }
        }
        return false;
    }
}
