package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/third-maximum-number/description/
 *
 * 循环3次，每次找出最大值，下次循环跳过该最大值找到第二大的值，循环
 */
public class Q414 {
    public static void main(String[] args) {
        System.out.println(new Q414().thirdMax(new int[]{3,2,1}));
    }

    // TODO 代码优化是不会优化的，这辈子都不会优化的
    public int thirdMax(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        int sec = nums[0]; boolean secExist = false; boolean secInit = false;
        for (int n : nums) {
            if (!secInit && n < max) {
                secInit = true; sec = n; secExist = true;
            }
            if (n < max && n > sec && secInit) {
                sec = n; secExist = true;
            }
        }
        if (!secExist) return max;
        int third = nums[0]; boolean thirdExist = false; boolean thirdInit = false;
        for (int n : nums) {
            if (!thirdInit && n < sec) {
                thirdInit = true; third = n; thirdExist = true;
            }
            if (n < sec && n > third && thirdInit) {
                third = n; thirdExist = true;
            }
        }
        return thirdExist ? third : max;
    }
}
