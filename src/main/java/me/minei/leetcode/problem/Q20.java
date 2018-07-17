package me.minei.leetcode.problem;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * using Stack
 */
public class Q20 {
    public static void main(String[] args) {
        System.out.println(new Q20().isValid("({})[]"));
    }

    // () [] {}
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

}
