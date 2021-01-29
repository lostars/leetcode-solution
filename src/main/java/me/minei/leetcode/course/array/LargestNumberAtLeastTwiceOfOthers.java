package me.minei.leetcode.course.array;

public class LargestNumberAtLeastTwiceOfOthers {

    public static void main(String[] args) {
        int[] nums = {0,0,2,3};
        System.out.println(new LargestNumberAtLeastTwiceOfOthers().dominantIndex(nums));
    }

    public int dominantIndex(int[] nums) {
        int max = -1, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {max = nums[i]; index = i;}
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == index) continue;
            if (max < nums[i] * 2) return -1;
        }
        return index;
    }
}
