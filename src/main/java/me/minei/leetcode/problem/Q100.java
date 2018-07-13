package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/same-tree/description/
 */
public class Q100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) {
            return p == null && q == null;
        }
        if(p.val != q.val) return false;
        else return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
