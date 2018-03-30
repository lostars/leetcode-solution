package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/length-of-last-word/description/
 */
public class Q58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("abc "));
    }
    public static int lengthOfLastWord(String s) {
        // 1.采用java string api先数组分割再取最后一个字符串
//        String[] ret = s.split(" ");
//        if (ret.length == 0) {
//            return 0;
//        } else {
//            return ret[ret.length - 1].length();
//        }
        // 2.只需确定第一个字符和第一个字符之后的第一个空格即可
        int start = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char tmp = s.charAt(i);
            if (tmp != ' ') {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    return start - i;
                }
            }
        }
        return start != -1 ? start + 1 : 0;
    }
}
