package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 * put numbers O(s), read numbers O(n*s)
 */
public class Q6 {
    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[][] data = new char[numRows][s.length()];
        int a = 0, b = 0;
        boolean up = false;
        for (int i = 0; i < s.length(); i++) {
            if (a < numRows && b < s.length()) {
                boolean flag = b % (numRows - 1) == 0;
                data[a][b] = s.charAt(i);
                if (a == 0) {
                    up = false; b++;
                } else if (a == numRows - 1) {
                    up = true; b++;
                }
                if (!up) {
                    a++;
                } else {
                    a--;
                }
                if (!flag) {
                    b++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (data[i][j] > 0) {
                    sb.append(data[i][j]);
                }
            }
        }

        return sb.toString();
    }

}
