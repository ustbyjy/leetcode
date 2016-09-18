package com.yan.leetcode;

/**
 * Linked List Cycle
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-18 17:31
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}
