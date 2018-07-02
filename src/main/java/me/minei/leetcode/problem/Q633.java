package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/sum-of-square-numbers/description/
 *
 * Two pointers
 */
public class Q633 {
    public static void main(String[] args) {
        System.out.println(new Q633().judgeSquareSum(1000000));
    }

    public boolean judgeSquareSum(int c) {
        int head = 0, tail = (int)Math.sqrt(c);
        while (head <= tail) {
            int sum = head * head + tail * tail;
            if (sum > c) {
                tail--;
            } else if (sum < c) {
                head++;
            } else {
                return true;
            }
        }
        return false;
    }

}
