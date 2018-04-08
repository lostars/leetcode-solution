package me.minei.leetcode.problem;

/**
 * https://leetcode.com/submissions/detail/149015750/
 */
public class Q26 {
    public static void main(String[] args) {
        int[] s = {1, 2};
        System.out.println(removeDuplicates(s));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i + 1] == nums[i]) {
                len--;
            } else {
                nums[index++] = nums[i];
            }
        }
        return len;
    }
}
