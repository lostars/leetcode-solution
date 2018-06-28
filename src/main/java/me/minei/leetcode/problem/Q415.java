package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/add-strings/description/
 */
public class Q415 {
    public static void main(String[] args) {
        System.out.println(new Q415().addStrings("1234", "1111"));
    }

    public String addStrings(String num1, String num2) {
        int temp = 0;
        int a = num1.length() - 1, b = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (a >= 0 || b >= 0) {
            // -30
            int a1 = 0, b1 = 0;
            if (a >= 0) {
                a1 = num1.charAt(a) - 48;
            }
            if (b >= 0) {
                b1 = num2.charAt(b) - 48;
            }
            sb.append((a1 + b1 + temp) % 10);
            temp = (a1 + b1 + temp) / 10;
            a--; b--;
        }
        if (temp > 0) {
            sb.append(temp);
        }
        return sb.reverse().toString();
    }
}
