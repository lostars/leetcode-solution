package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/ugly-number/description/
 */
public class Q263 {
    public static void main(String[] args) {
        System.out.println(new Q263().isUgly(6));
    }

    public boolean isUgly(int num) {
        if (num <= 0)
            return false;
        while (true) {
            if (num % 2 == 0)
                num /= 2;
            else if (num % 3 == 0)
                num /= 3;
            else if (num % 5 == 0)
                num /= 5;
            else return num == 1;
        }
    }

}
