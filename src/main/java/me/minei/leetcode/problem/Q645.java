package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/set-mismatch/description/
 */
public class Q645 {
    public static void main(String[] args) {
        int[] result = new Q645().findErrorNums(new int[]{3,3,1});
        System.out.println(result[0] + "," + result[1]);
    }

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] map = new int[nums.length];
        for (int num : nums) {
            if (map[num - 1] > 0) {
                result[0] = num;
            } else {
                map[num - 1] = 1;
            }
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0) {
                result[1] = ++i; break;
            }
        }
        return result;
    }
}
