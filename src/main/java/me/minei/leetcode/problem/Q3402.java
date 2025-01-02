package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/minimum-operations-to-make-columns-strictly-increasing/
 */
public class Q3402 {
//    [[3,2],[1,3],[3,4],[0,1]]
//    [[3,2,1],[2,1,0],[1,2,3]]
//    50 50
//    0  0
    public int minimumOperations(int[][] grid) {
        int result = 0;
        for (int i = 1; i < grid.length; i++) {
            for (int k = 0; k < grid[0].length; k++) {
                if (grid[i][k] > grid[i - 1][k]) continue;
                result += (grid[i - 1][k] + 1 - grid[i][k]);
                grid[i][k] = grid[i - 1][k] + 1;
            }
        }
        return result;
    }
}
