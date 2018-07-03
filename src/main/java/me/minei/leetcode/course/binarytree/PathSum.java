package me.minei.leetcode.course.binarytree;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/537/
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        // method 2
//        return sum(root, sum, 0);
    }

    // method 2
    // count sum
    public boolean sum(TreeNode node, int sum, int cur) {
        if (node == null) {
            return sum == cur;
        }
        if (node.right == null && node.left == null) {
            cur += node.val;
            return cur == sum;
        }
        return sum(node.left, sum, cur + node.val) || sum(node.right, sum, cur + node.val);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
