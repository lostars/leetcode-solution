package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/unique-paths-ii/
 */
public class Q63 {
    public static void main(String[] args) {
        int[][] s = new int[3][3];
        s[1][1] = 1;
        s[1][2] = 1;
//        s[1][0] = 1;
        System.out.println(new Q63().uniquePathsWithObstacles(s));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (i == 0 && j == 0) {
                    obstacleGrid[i][j] = 1; continue;
                }
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0; continue;
                }
                if (i == 0 || j == 0) {
                    obstacleGrid[i][j] = i == 0 ? obstacleGrid[i][j - 1] : obstacleGrid[i - 1][j];
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }

        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
