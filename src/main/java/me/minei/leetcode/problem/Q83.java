package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 * 注意链表是有序的
 */
public class Q83 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);
        l1.next = l2; l2.next = l3;
//        l1.next = l3;
//        System.out.println(l1.val);
//        System.out.println(l1.next.val);
//        System.out.println(l1.next.next.val);
        ListNode ret = deleteDuplicates(l1);
        System.out.println(deleteDuplicates(l1).val);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        int number = head.val;
        while (node.next != null) {
            if (node.next.val > number) {
                number = node.next.val;
                node = node.next;
            } else {
                if (node.next.next == null) {
                    node.next = null;
                    return head;
                } else {
                    node.next = node.next.next;
                }
            }
        }
        return head;
    }
}
