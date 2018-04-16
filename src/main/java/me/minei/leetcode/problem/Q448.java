package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
public class Q448 {
    public static void main(String[] args) {
        int[] s = {5,4,6,7,9,3,10,9,5,6};
        // 3 4 5 5 6 6 7 9 9 10
        System.out.println(findDisappearedNumbers(s));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] data = new int[nums.length];
        for (int n : nums) {
            data[n - 1] = n;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0)
                list.add(i + 1);
        }
        return list;
    }
}
