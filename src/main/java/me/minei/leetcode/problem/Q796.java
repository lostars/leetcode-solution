package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/rotate-string/description/
 */
public class Q796 {
    public static void main(String[] args) {
        System.out.println(new Q796().rotateString("bqqutquvbtgouklsayfvzewpnrbwfcdmwctusunasdbpbmhnvy",
                "wpnrbwfcdmwctusunasdbpbmhnvybqqutquvbtgouklsayfvze"));
        System.out.println(new Q796().rotateString("abcde", "deabc"));
    }

    public boolean rotateString(String A, String B) {
        if ("".equals(A) || "".equals(B)) {
            return "".equals(A) && "".equals(B);
        }
        if (A.length() != B.length())
            return false;
        for (int i = B.length() - 1; i >=0; i--) {
            if (B.charAt(i) == A.charAt(0) && A.startsWith(B.substring(i))) {
                if (B.startsWith(A.substring(B.length() - i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
