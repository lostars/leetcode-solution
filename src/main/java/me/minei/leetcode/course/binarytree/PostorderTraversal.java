package me.minei.leetcode.course.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 后序遍历，左右子树然后根
 */
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        find(root, list);
        return list;
    }

    public void find(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            find(node.left, list);
        }
        if (node.right != null) {
            find(node.right, list);
        }
        list.add(node.val);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
