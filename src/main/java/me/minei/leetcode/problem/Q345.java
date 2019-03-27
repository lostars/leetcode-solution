package me.minei.leetcode.problem;

import java.util.Arrays;
import java.util.List;

public class Q345 {

    public static void main(String[] args) {
        System.out.println(new Q345().reverseVowels("OE"));
    }

    public String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] result = s.toCharArray();
        int left = 0, right = result.length - 1;
        char leftChar = 0, rightChar = 0;
        while (left < right) {
            if (leftChar != 0 && rightChar != 0) {
                char tmp = result[left];
                result[left] = result[right];
                result[right] = tmp;
                left++; right--;
                leftChar = 0; rightChar = 0;
            }
            if (vowels.contains(result[left])) {
                leftChar = result[left];
            } else {
                left++;
            }
            if (vowels.contains(result[right])) {
                rightChar = result[right];
            } else {
                right--;
            }
        }
        return new String(result);
    }
}
