package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/plus-one/description/
 */
public class Q66 {
    public static void main(String[] args) {
        int[] data = new Q66().plusOne(new int[]{4,3,2,1});
        for (int n : data) {
            System.out.print(n + ",");
        }
    }
    public int[] plusOne(int[] digits) {
        int t = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int add = i == digits.length - 1 ? 1 : 0;
            int s = (t + digits[i] + add) / 10;
            digits[i] = (t + digits[i] + add) % 10;
            t = s;
        }
        int[] result = new int[t > 0 ? digits.length + 1 : digits.length];
        int index = 0;
        if (t > 0) result[index++] = t;
        for (int n : digits) {
            result[index++] = n;
        }
        return result;
    }
}
