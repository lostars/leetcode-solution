package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/
 */
public class Q3396 {

//     0 1 2 3 4 5
//    [1,3,0,4,9,6,1,5,7]
//             |   |
    public int minimumOperations(int[] nums) {
        if (nums.length == 1) return 0;
        int times = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) continue;
                times++;
                i = times * 3;
                j = i;
            }
        }
        return times;
    }

    public static void main(String[] args) {
        Q3396 q3396 = new Q3396();
        System.out.println(q3396.minimumOperations(new int[]{1,1,3,4,2,3,3,5,7}));
        System.out.println(q3396.minimumOperations(new int[]{4,5,6,4,4}));
        System.out.println(q3396.minimumOperations(new int[]{1,1}));
        System.out.println(q3396.minimumOperations(new int[]{6,7,8,9}));
//        System.out.println(1 ^ 1);
//        System.out.println(4^2^3^3);
    }
}
