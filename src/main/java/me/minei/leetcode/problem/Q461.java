package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/hamming-distance/description/
 */
public class Q461 {
    public static void main(String[] args) {
        System.out.println(new Q461().hammingDistance(1,4));
    }

    public int hammingDistance(int x, int y) {
        // or Integer.bitCount(x ^ y);
        int t = x ^ y;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((t & 1) == 1) result++;
            t = t >>> 1;
        }
        return result;
    }
}
