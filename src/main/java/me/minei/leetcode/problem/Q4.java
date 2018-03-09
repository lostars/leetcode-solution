package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * 注意这个题目测试用例允许空数组，新的数组是a+b 不是a并b，也就是说新数组元素个数是 a+b
 */
public class Q4 {
    public static void main(String[] args) {
        int[] a = new int[]{1,1};
        int[] b = new int[]{1,2};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > 0 && nums2.length > 0) {
            List<Integer> arrays = new ArrayList<>();
            int nums2Index = 0;
            int nums1Index = 0;
            while (nums1Index <= nums1.length - 1 && nums2Index <= nums2.length - 1) {
                int addNum = nums1[nums1Index] <= nums2[nums2Index] ? nums1[nums1Index] : nums2[nums2Index];
                arrays.add(addNum);
                if (nums1[nums1Index] == nums2[nums2Index]) {
                    arrays.add(addNum);
                }
                if (addNum == nums2[nums2Index] && nums2Index <= nums2.length - 1) {
                    nums2Index++;
                }
                if (addNum == nums1[nums1Index] && nums1Index <= nums1.length - 1) {
                    nums1Index++;
                }
            }
            while (nums2Index <= nums2.length - 1) {
                arrays.add(nums2[nums2Index]);
                nums2Index++;
            }
            while (nums1Index <= nums1.length - 1) {
                arrays.add(nums1[nums1Index]);
                nums1Index++;
            }
            boolean odd = arrays.size() % 2 != 0;
            if (odd) {
                return arrays.get((arrays.size() - 1) / 2);
            } else {
                int a = arrays.get(arrays.size() / 2);
                int b = arrays.get(arrays.size() / 2 - 1);
                return (a + b) / 2.0;
            }
        } else {
            if (nums1.length == 0 && nums2.length == 0) {
                return 0;
            }
            if (nums1.length == 0) {
                int l = nums2.length;
                return l % 2 == 0 ? (nums2[l / 2] + nums2[l / 2 -1]) / 2.0 : nums2[(l - 1) / 2];
            }
            if (nums2.length == 0) {
                int l = nums1.length;
                return l % 2 == 0 ? (nums1[l / 2] + nums1[l / 2 -1]) / 2.0 : nums1[(l - 1) / 2];
            }

            return 0;
        }
    }
}
