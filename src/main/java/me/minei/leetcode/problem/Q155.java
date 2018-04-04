package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/min-stack/description/
 */
public class Q155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());  // --> Returns -3.
        minStack.pop();
        System.out.println(minStack.top());      //--> Returns 0.
        System.out.println(minStack.getMin());   //--> Returns -2.
    }

    static class MinStack {
        private List<Integer> data = new ArrayList<>();
        private Integer min = null;
        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            data.add(x);
            if (min == null) {
                min = x;
            } else {
                if (x < min) {
                    min = x;
                }
            }
        }

        public void pop() {
            if (data.size() == 0) return;
            data.remove(data.size() - 1);
            if (data.size() == 0) {
                min = null;
            } else {
                min = data.get(0);
                for (Integer m : data) {
                    if (m < min) min = m;
                }
            }
        }

        public int top() {
            return data.size() == 0 ? 0 : data.get(data.size() - 1);
        }

        public int getMin() {
            return min;
        }
    }
}
