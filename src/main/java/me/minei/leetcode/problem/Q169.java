package me.minei.leetcode.problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/majority-element/description/
 */
public class Q169 {
    public static void main(String[] args) {
        System.out.println(new Q169().majorityElement2(new int[]{6,5,5,5,6,6,6}));
    }

    public int majorityElement2(int[] nums) {
        // 超过一半 剩下的肯定是答案
        int num = nums[0], time = 1;
        for (int i = 1; i < nums.length; i++) {
            if (time == 0) num = nums[i];
            if (nums[i] == num) time++;
            else time--;
        }
        return num;
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        int time = 0;
        for (int n : nums) {
            if (n != num) {
                if (time > nums.length / 2) {
                    return num;
                } else {
                    num = n; time = 1;
                }
            } else {
                time++;
            }
        }
        return num;
    }
}
