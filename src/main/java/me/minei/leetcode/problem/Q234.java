package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/palindrome-linked-list/description/
 * 时间复杂度O(n),空间复杂度O(n)
 */
public class Q234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        int length = 1;
        ListNode node = head;
        while (node.next != null) {
            length++; node = node.next;
        }
        int[] data = new int[length];
        data[0] = head.val;
        int index = 1;
        node = head;
        while (node.next != null) {
            data[index++] = node.next.val;
            node = node.next;
        }
        int start = 0, end = data.length - 1;
        while (start <= end) {
            if (data[start++] != data[end--]) return false;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
