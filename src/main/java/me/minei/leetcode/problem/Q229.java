package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/majority-element-ii/description/
 */
public class Q229 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(new Q229().majorityElement(nums));
    }

    // 先排序 时间复杂度(包含排序) O(nlogn) 空间复杂度 O(1)
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        int num = nums[0], time = 0;
        for (int n : nums) {
            if (time == 0) {
                num = n; time = 1;
            } else {
                if (num == n) {
                    time++;
                } else {
                    num = n; time = 1;
                }
            }
            if (time > nums.length / 3 && !result.contains(num)) {
                result.add(num); time = 0;
            }
        }
        return result;
    }
}
