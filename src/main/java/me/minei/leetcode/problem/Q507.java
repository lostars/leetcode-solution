package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/perfect-number/description/
 * 完全数，目前发现了有限个。。。
 */
public class Q507 {
    public static void main(String[] args) {

    }

    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
        // return ((num == 6) || (num == 28) || (num == 496) || (num == 8128) || (num == 33550336));
    }
}
