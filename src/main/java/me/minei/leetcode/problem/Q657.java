package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/judge-route-circle/description/
 */
public class Q657 {
    public static void main(String[] args) {

    }
    public static boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0) return false;
        int u = 0, d = 0, l = 0, r = 0;
        for (int i = 0; i < moves.length(); i++) {
            char s = moves.charAt(i);
            switch (s) {
                case 'U' : u++; break;
                case 'D' : d++; break;
                case 'L' : l++; break;
                case 'R' : r++; break;
            }
        }
        return u == d && r == l;
    }
}
