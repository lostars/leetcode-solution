package me.minei.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 *
 */
public class Q19 {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> array = new ArrayList<>();
        array.add(head);
        ListNode node = head;
        while (node.next != null) {
            array.add(node.next);
            node = node.next;
        }
        ListNode remove = array.get(array.size() - n);
        if (remove.next != null) {
            if (array.size() - n - 1 < 0) {
                return remove.next;
            } else {
                array.get(array.size() - n - 1).next = remove.next;
            }
        } else {
            if (array.size() - n - 1 < 0) {
                return null;
            } else {
                array.get(array.size() - n - 1).next = null;
            }
        }
        return array.get(0);
    }
}
