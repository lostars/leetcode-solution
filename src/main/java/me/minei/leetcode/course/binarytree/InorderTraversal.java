package me.minei.leetcode.course.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/929/
 *
 * 中序遍历 先左节点后根然后右节点，子节点依旧按照这个方式
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        find(root, result);
        return result;
    }

    public void find(TreeNode node, List<Integer> list) {
        if (node != null) {
            if (node.left != null) {
                find(node.left, list);
            }
            list.add(node.val);
            if (node.right != null) {
                find(node.right, list);
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
