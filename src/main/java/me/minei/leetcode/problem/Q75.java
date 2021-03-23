package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public class Q75 {

    public void sortColors(int[] nums) {
        // 计算每种颜色出现次数,然后重新赋值即可
        int red = 0, white = 0, blue = 0;
        for(int n : nums) {
            if(n == 0) red++;
            if(n == 1) white++;
            if(n == 2) blue++;
        }
        int index = 0;
        while(index < nums.length) {
            if(index <= red - 1) nums[index] = 0;
            else if(index <= red + white - 1) nums[index] = 1;
            else if(index <= red + white + blue - 1) nums[index] = 2;
            index++;
        }
    }
}
