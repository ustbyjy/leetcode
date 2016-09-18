package com.yan.leetcode;

/**
 * Intersection of Two Linked Lists
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-18 18:19
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode tempA = headA;
        while (tempA.next != null) {
            tempA = tempA.next;
        }
        tempA.next = headB;
        ListNode fast = headA;
        ListNode slow = headA;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }

        if (fast == null || fast.next == null) {
            tempA.next = null;   // recover original structure
            return null;
        }
        // fast是slow速度的两倍，从相遇点开始，fast以一倍速度和start走同样的距离，在相交点相遇
        ListNode start = headA;
        while (start != fast) {
            fast = fast.next;
            start = start.next;
        }
        tempA.next = null;      // recover original structure
        return fast;
    }
}
