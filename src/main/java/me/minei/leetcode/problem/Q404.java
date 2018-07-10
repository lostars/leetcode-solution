package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/description/
 */
public class Q404 {
    public static void main(String[] args) {

    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root, false);
        return sum;
    }

    private int sum = 0;
    public void sum(TreeNode root, boolean left) {
        if (root == null) return;
        if (root.left == null && root.right == null && left) sum += root.val;
        sum(root.left, true);
        sum(root.right, false);
    }
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
