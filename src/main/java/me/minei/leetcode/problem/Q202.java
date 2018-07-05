package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/happy-number/description/
 * 出现89就开始循环，4最终会到89，所以1和4是关键的数字
 */
public class Q202 {
    public static void main(String[] args) {
        System.out.println(new Q202().isHappy(34));
    }
    public boolean isHappy(int n) {
        int num = 0;
        while (true) {
            for (char c : String.valueOf(n).toCharArray()) {
                num += (c - '0') * (c - '0');
            }
            System.out.println(num);
            if (num == 1) return true;
            else if(num == 89) return false;
            n = num; num = 0;
        }
    }
}
