package me.minei.leetcode.course.binarytree;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/535/
 */
public class MaximumDepthOfBinaryTree {

    // 1.bottom-top solution
    public int maxDepth(TreeNode root) {
        // method 1
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        // method 2
//        depth = root == null ? 0 : 1;
//        max(root, 0);
//        return depth;
    }

    private int depth;
    // top-bottom solution
    public void max(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (node.right == null && node.left == null) {
            depth = Math.max(level, depth);
        }
        max(node.left, level + 1);
        max(node.right, level + 1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
