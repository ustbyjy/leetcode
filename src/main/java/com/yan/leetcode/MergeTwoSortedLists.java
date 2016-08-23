package com.yan.leetcode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(4);
		l2.next = new ListNode(7);
		l2.next.next = new ListNode(8);

		ListNode result = mergeTwoLists(l1, l2);

		System.out.println(result);
	}

	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode newhead = new ListNode(0);
		ListNode p = newhead;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				p.next = l2;
				l2 = l2.next;
			} else {
				p.next = l1;
				l1 = l1.next;
			}
			p = p.next;
		}
		if (l1 == null)
			p.next = l2;
		else
			p.next = l1;
		return newhead.next;

	}

}
