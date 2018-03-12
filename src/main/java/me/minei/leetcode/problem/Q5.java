package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 *
 */
public class Q5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int max = 0;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int head = i, tail = i;
            int head1 = -1, tail1 = -1;
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                head1 = i; tail1 = i + 1;
            }
            while ((head >= 0 && tail < s.length()) || (head1 >= 0 && tail1 < s.length())) {
                if (head >= 0 && tail < s.length() && s.charAt(head) == s.charAt(tail)) {
                    if (tail - head + 1 >= max) {
                        max = tail - head + 1;
                        start = head; end = tail;
                    }
                    head--; tail++;
                } else if (head1 >= 0 && tail1 < s.length() && tail1 >= 0 && s.charAt(head1) == s.charAt(tail1)) {
                    if (tail1 - head1 + 1 >= max) {
                        max = tail1 - head1 + 1;
                        start = head1; end = tail1;
                    }
                    head1--; tail1++;
                } else {
                    break;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
