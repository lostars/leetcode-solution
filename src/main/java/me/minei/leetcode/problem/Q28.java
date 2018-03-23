package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/implement-strstr/description/
 */
public class Q28 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","a"));
    }
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int index = 0;
        while (index < haystack.length()) {
            if (haystack.length() - index < needle.length()) break;
            if (haystack.substring(index, index + needle.length()).equals(needle)) {
                return index;
            } else {
                boolean flag = false;
                for (int i = 0, tmp = index; i < needle.length() && tmp < haystack.length(); i++, tmp++) {
                    // 跳到下一个首字符相同的地方
                    if (haystack.charAt(tmp) == needle.charAt(0) && i > 0) {
                        index += i; flag = true; break;
                    }
                }
                if (!flag) index++;
            }
        }
        return -1;
    }
}
