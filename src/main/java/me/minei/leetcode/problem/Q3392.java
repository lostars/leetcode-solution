package me.minei.leetcode.problem;

public class Q3392 {

//    [-1,-4,-1,4]
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 2 >= nums.length) break;
            if (nums[i + 1] / 2.0 == nums[i] + nums[i + 2]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Q3392 q3392 = new Q3392();
        System.out.println(q3392.countSubarrays(new int[]{-1,-4,-1,4}));
    }
}
