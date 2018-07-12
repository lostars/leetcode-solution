package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/
 * from tail to head
 */
public class Q88 {

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        new Q88().merge(nums1, 3, nums2, 3);
        for (int n : nums1) {
            System.out.print(n + ",");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1, idx2 = n - 1;
        int index = nums1.length - 1;
        while (index >= 0) {
            int val;
            if (idx1 >= 0 && idx2 >= 0) {
                val = Math.max(nums1[idx1], nums2[idx2]);
                if (nums1[idx1] > nums2[idx2]) idx1--;
                else idx2--;
            } else if (idx1 >= 0) {
                val = nums1[idx1--];
            } else {
                val = nums2[idx2--];
            }
            nums1[index--] = val;
        }
    }
}
