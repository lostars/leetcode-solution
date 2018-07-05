package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/sliding-window-maximum/description/
 */
public class Q239 {

    public static void main(String[] args) {
        int[] s = new int[]{1,3,-1,-3,5,3,6,7};
        int[] data = new Q239().maxSlidingWindow(s, 1);
        for (int i : data) {
            System.out.print(i + ",");
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
//        if (nums.length == 0) return nums;
//        int start = 0, end = k - 1;
//        int[] data = new int[nums.length - k + 1];
//        int index = 0;
//        while (end < nums.length) {
//            data[index++] = findMax(nums, start, end);
//            end++; start++;
//        }
//        return data;
        if (nums.length == 0) return nums;
        int start = 0, end = k - 1;
        int[] data = new int[nums.length - k + 1];
        // 返回数据填充位置
        int index = 0;
        // 是否需要重新计算最大值
        boolean reMax = true;
        // 最大值和最大值位置
        int max = nums[start], maxIndex = start;
        while (end < nums.length) {
            if (reMax) {
                // 计算最大值
                for (int i = start; i <= end; i++) {
                    if (nums[i] > max) {
                        max = nums[i]; maxIndex = i; reMax = false;
                    }
                }
            }
            // 填充数据
            data[index++] = max;
            if (start + 1 <= maxIndex) {
                // 如果移动后最大值依旧在范围内只需要比较新增值和当前最大值大小即可
                if (end + 1 < nums.length && nums[end + 1] >= max) {
                    max = nums[end + 1]; maxIndex = end + 1;
                }
            } else {
                // 最大值已经在范围外，需要重新计算最大值，最大值初始值从上一个最大值+1开始
                reMax = true;
                if (maxIndex + 1 < nums.length) max = nums[++maxIndex];
            }
            end++; start++;
        }
        return data;
    }

    // O(k*(n -k))
    public int findMax(int[] nums, int start, int end) {
        int max = nums[start];
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }
}
