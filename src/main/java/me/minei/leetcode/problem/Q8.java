package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 *
 */
public class Q8 {
    public static void main(String[] args) {
//        System.out.println(myAtoi("     +004500"));
        System.out.println(myAtoi(" b11228552307"));
        System.out.println(myAtoi("    -00134"));
//        System.out.println(Integer.parseInt("+"));
    }
    public static int myAtoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '-' && sb.length() < 1) {
                sb.append(c); flag = true;
                continue;
            }
            if (c == '+' && sb.length() < 1) {
                sb.append(c); flag = true;

                continue;
            }
            if (c > 57 || c < 48) {
                if (c != ' ') {
                    break;
                } else {
                    if (sb.length() > 0) {
                        break;
                    }
                }
            } else {
                sb.append(c);
            }
        }
        str = sb.toString();
        if (str.length() > 0) {
            if (str.length() == 1 && flag) {
                return 0;
            }
        } else {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return str.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
