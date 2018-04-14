package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/detect-capital/description/
 */
public class Q520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("AAA"));
    }
    public static boolean detectCapitalUse(String word) {
        // 大写字母：65-90 小写字母：97-122
        // 确定前两个字母即可
        int A = -1, a = -1;
        boolean flag = false;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                if (A > -1) {
                    flag = true;
                } else {
                    A = i;
                }
            } else if (ch >= 'a' && ch <= 'z' && a == -1) {
                a = i;
            }
        }
        return (A == 0 && a == -1) || (a == 0 && A == -1) || (A == 0 && a == 1 && !flag);
    }
}
