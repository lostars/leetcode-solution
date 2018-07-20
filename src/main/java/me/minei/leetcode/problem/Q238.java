package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 *
 * best solution 从两边计算，循环两次
 */
public class Q238 {
    public static void main(String[] args) {
        //
        int[] ret = new Q238().productExceptSelf(new int[]{3,0,6,4});
        // 48 72 24 36
        // 3 0 6 4
        // 0 72 0 0
        for (int n : ret) {
            System.out.print(n + ",");
        }
    }

    // 不计算0，有两个0即可直接返回
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int t = 1, zero = 0, zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++; zeroIndex = i;
            } else {
                t *= nums[i];
            }
        }
        if (zero > 1) return result;
        if (zero == 1) {
            result[zeroIndex] = t;
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = t / nums[i];
        }
        return result;
    }
}
