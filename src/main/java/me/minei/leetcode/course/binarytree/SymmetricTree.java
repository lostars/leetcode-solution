package me.minei.leetcode.course.binarytree;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/536/
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return is(root.left, root.right);
    }

    public boolean is(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == null && right == null;
        if (left.val != right.val) return false;
        return is(left.left, right.right) && is(left.right, right.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
