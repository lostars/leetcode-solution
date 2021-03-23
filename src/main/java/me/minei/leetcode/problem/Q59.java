package me.minei.leetcode.problem;

/**
 * @see me.minei.leetcode.problem.Q54
 */
import java.util.Arrays;

public class Q59 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Q59().generateMatrix(3)));
    }
    public int[][] generateMatrix(int n) {
        int x = 0, y = 0;
        int[][] data = new int[n][n];
        int xMax = n - 1, yMax = n - 1;
        int index = 1, circle = 0;
        // 0:y 1:x 0:decrease 1:increase
        int d = 1;
        while(index < (xMax + 1) * (yMax + 1)) {
            data[x][y] = index++;
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
        }
        data[x][y] = index;
        return data;
    }
}
