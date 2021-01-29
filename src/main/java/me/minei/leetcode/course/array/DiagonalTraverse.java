package me.minei.leetcode.course.array;

import java.util.Arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,4},
                {3,5,6},
                {1,2,1},
                {3,2,1}
        };
        System.out.println(Arrays.toString(new DiagonalTraverse().findDiagonalOrder(matrix)));
    }

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new int[]{};
        int rows = matrix.length, cols = matrix[0].length;
        int[] result = new int[matrix.length * matrix[0].length];

        // 00 01 02 12 22 32 31 30 20 10 11 21

        return result;
    }
}
