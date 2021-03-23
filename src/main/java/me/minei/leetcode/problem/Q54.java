package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(new Q54().spiralOrder(nums));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int x = 0, y = 0;
        List<Integer> data = new ArrayList<>();
        int xMax = matrix.length - 1, yMax = matrix[0].length - 1;
        int index = 0, circle = 0;
        // 0:y 1:x 0:decrease 1:increase
        int d = 1;
        while(index < (xMax + 1) * (yMax + 1)) {
            data.add(matrix[x][y]);
            switch(d) {
                case 1: // y++
                    if(y >= yMax - circle) {d = 3; x++;}
                    else y++;
                    break;
                case 3: // x++
                    if(x >= xMax - circle) {d = 0; y--;}
                    else x++;
                    break;
                case 0: // y--
                    if(y <= circle) {d = 2; circle++; x--;}
                    else y--;
                    break;
                case 2: // x--
                    if(x <= circle) {d = 1; y++;}
                    else x--;
                    break;
            }
            index++;
        }
        return data;
    }
}
