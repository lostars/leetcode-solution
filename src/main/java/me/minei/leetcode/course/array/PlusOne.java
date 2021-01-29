package me.minei.leetcode.course.array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9,9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int[] plus = new int[digits.length];
        int up = 0, index = plus.length - 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + up + (i == digits.length - 1 ? 1 : 0);
            if (sum >= 10) {
                up = 1; plus[index--] = sum - 10;
            } else {
                up = 0; plus[index--] = sum;
            }
        }
        if (up <= 0) return plus;
        int[] newPlus = new int[digits.length + 1];
        newPlus[0] = up;
        System.arraycopy(plus, 0, newPlus, 1, newPlus.length - 1);
        return newPlus;
    }
}
