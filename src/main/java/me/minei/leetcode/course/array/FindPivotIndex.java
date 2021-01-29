package me.minei.leetcode.course.array;

public class FindPivotIndex {

    public static void main(String[] args) {
        // int[] nums = {1,7,3,6,5,6};
        // int[] nums = {1,2,3};
        int[] nums = {-1,-1,-1,0,1,1};
        System.out.println(new FindPivotIndex().pivotIndex1(nums));
    }

    // dp solution
    public int pivotIndex1(int[] nums) {
        int[] dp = new int[nums.length + 1];
        int sum = 0, index = 1;
        for (int num : nums) {
            sum += num; dp[index++] = sum;
        }
        for (int i = 0; i < dp.length && i < nums.length; i++) {
            if (dp[i] == dp[dp.length - 1] - dp[i] - nums[i]) return i;
        }
        return -1;
    }

    // worst solution!
    public int pivotIndex(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int leftSum = 0, rightSum = 0;
            for (int i = 0; i < index; i++) leftSum += nums[i];
            for (int i = index + 1; i < nums.length; i++) rightSum += nums[i];
            if (leftSum == rightSum) return index;
            else index++;
        }
        return -1;
    }
}
