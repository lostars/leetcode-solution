package me.minei.leetcode.problem;

public class Q1572 {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        int[][] mat2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(new Q1572().diagonalSum(mat));
    }

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        boolean odd = mat.length % 2 == 1;
        // 循环一次即可,另外一列可以对称获取值
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i] + (odd && (mat.length - 1) / 2 == i ? 0 : mat[mat[i].length - i - 1][i]);
        }
        return sum;
    }
}
