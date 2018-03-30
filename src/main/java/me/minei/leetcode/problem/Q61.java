package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/rotate-list/description/
 * 1.转化数组处理
 * 2.不使用数组，循环两次，第一次获取节点总数，第二次确定位置进行转换
 */
public class Q61 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
        System.out.println(rotateRight(l1, 99).val);
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        ListNode node = head;
        while (node.next != null) {
            list.add(node.next);
            node = node.next;
        }
        int size = list.size();
        if (k % size == 0) {
            return head;
        } else {
            k = k % size;
        }
        list.get(size - 1).next = head;
        list.get(size - k - 1).next = null;
        return list.get(size - k);
    }
}
