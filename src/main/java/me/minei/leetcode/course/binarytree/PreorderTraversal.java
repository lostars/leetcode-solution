package me.minei.leetcode.course.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928/
 *
 * 先序遍历 先根先左后右，子树也是按照先左后右
 *
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        getNumber(root, result);
        return result;
    }

    public void getNumber(TreeNode node, List<Integer> list) {
        if (node != null) {
            list.add(node.val);
            if (node.left != null) {
                getNumber(node.left, list);
            }
            if (node.right != null) {
                getNumber(node.right, list);
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
