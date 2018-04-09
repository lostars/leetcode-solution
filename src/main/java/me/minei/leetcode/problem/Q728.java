package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/description/
 */
public class Q728 {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> s = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String str = String.valueOf(i);
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0' || i % (str.charAt(j) - 48) != 0) flag = false;
            }
            if (flag) s.add(i);
        }
        return s;
    }
}
