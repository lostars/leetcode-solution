package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 *
 * Are you kidding me? Is this a medium problem?
 * 看了讨论才知道需要的复杂度是O(logn)
 */
public class Q153 {
    public static void main(String[] args) {
        System.out.println(new Q153().findMin1(new int[]{3,1,2}));
        System.out.println(new Q153().findMin1(new int[]{3,4,5,1,2}));
        System.out.println(new Q153().findMin1(new int[]{4,5,6,1,2,3}));
        System.out.println(new Q153().findMin1(new int[]{1}));
    }
    public int findMin1(int[] nums) {
        int left = 0, right = nums.length - 1;
        int leftV= nums[left], rightV = nums[right];
        while (left <= right) {
            if (nums[left] < leftV) return nums[left];
            else left++;
            if (nums[right] > rightV) return nums[right + 1];
            else right--;
        }
        return Math.min(Math.min(nums[0], nums[nums.length - 1]), nums[right + 1]);
    }
    // O(n)
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int n : nums) {
            if (n < min) return n;
        }
        return min;
    }
}
