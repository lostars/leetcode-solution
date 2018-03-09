package me.minei.leetcode.problem;

/**
 * Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 */
public class Q2 {
    public static void main(String[] args) {
        ListNode l1 = getListNode(new int[]{1});
        ListNode l2 = getListNode(new int[]{9,9});
        System.out.println(addTwoNum(l1, l2));
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode getListNode(int[] nums) {
        ListNode current = null;
        ListNode r = null;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                r = new ListNode(nums[i]);
                current = r;
            } else {
                ListNode node = new ListNode(nums[i]);
                current.next = node;
                current = node;
            }
        }
        return r;
    }

    public static ListNode addTwoNum(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode l1Cur = l1;
        ListNode l2Cur = l2;
        ListNode current = null;
        int nextUpVal = 0;
        do {

            int sum = l1Cur.val + l2Cur.val + nextUpVal;

            int curVal = sum % 10;
            nextUpVal = sum / 10;

            if (result == null) {
                result = new ListNode(curVal);
                current = result;
            } else {
                ListNode node = new ListNode(curVal);
                current.next = node;
                current = node;
            }
            l1Cur = l1Cur.next;
            l2Cur = l2Cur.next;

        } while (l1Cur != null && l2Cur != null);
        if (l1Cur != null) {
            do {
                int sum = l1Cur.val + nextUpVal;

                int curVal = sum % 10;
                nextUpVal = sum / 10;
                ListNode node = new ListNode(curVal);
                current.next = node;
                current = node;
                l1Cur = l1Cur.next;

            } while (l1Cur != null);

        } else if (l2Cur != null) {
            do {
                int sum = l2Cur.val + nextUpVal;

                int curVal = sum % 10;
                nextUpVal = sum / 10;
                ListNode node = new ListNode(curVal);
                current.next = node;
                current = node;
                l2Cur = l2Cur.next;

            } while (l2Cur != null);

        }
        if (nextUpVal > 0) {
            current.next = new ListNode(nextUpVal);
        }

        return result;
    }
}
