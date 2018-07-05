package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/invert-binary-tree/description/
 */
public class Q226 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
