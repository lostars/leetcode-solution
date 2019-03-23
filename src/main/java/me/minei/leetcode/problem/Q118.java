package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q118 {

    public static void main(String[] args) {
        System.out.println(new Q118().generate1(5));
    }

    // method 1
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(Arrays.asList(1));
        if (numRows == 1) {
            return result;
        }
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> lastRow = result.get(result.size() - 1);
            List<Integer> curRow = new ArrayList<>(Arrays.asList(1));
            int index = 0;
            while (index < lastRow.size() - 1) {
                curRow.add(lastRow.get(index) + lastRow.get(index + 1));
                index++;
            }
            curRow.add(1);
            result.add(curRow);
        }

        return result;
    }

    // method 2
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            result.add(gen(i));
        }
        return result;
    }

    public List<Integer> gen(int rowNum) {
        if (rowNum == 1) {
            return Arrays.asList(1);
        }
        List<Integer> lastRow = gen(rowNum - 1);
        List<Integer> result = new ArrayList<>(Arrays.asList(1));
        int index = 0;
        while (index < lastRow.size() - 1) {
            result.add(lastRow.get(index) + lastRow.get(index + 1));
            index++;
        }
        result.add(1);
        return result;
    }
}
