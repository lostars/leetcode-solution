package me.minei.leetcode.problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/single-number/description/
 */
public class Q136 {
    public static void main(String[] args) {
        int[] s = {1,4,4,1,5};
        System.out.println(singleNumber(s));
    }
    public static int singleNumber(int[] nums) {
        if (nums == null || nums.length % 2 == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // 1.先排序
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[0] != nums[1]) {
//                return nums[0];
//            }
//            if (nums[nums.length - 1] != nums[nums.length - 2]) {
//                return nums[nums.length - 1];
//            }
//            if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1] && i > 1 && i < nums.length - 2) {
//                return nums[i];
//            }
//        }
        // 2.异或运算
        int number = 0;
        for (int num : nums) {
            number ^= num;
        }
        return number;
    }
}
