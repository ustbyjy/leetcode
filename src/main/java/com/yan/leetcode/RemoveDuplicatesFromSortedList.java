package com.yan.leetcode;

import org.junit.Test;

public class RemoveDuplicatesFromSortedList {

	@Test
	public void test() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		// head.next.next = new ListNode(2);
		System.out.println(deleteDuplicates2(head));
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode index = head;
		while (index.next != null) {
			if (index.next.val == index.val) {
				index.next = index.next.next;
			} else {
				index = index.next;
			}
		}
		return head;
	}

	public ListNode deleteDuplicates2(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode newHead = new ListNode(Integer.MAX_VALUE);
		ListNode index = newHead;
		while (head != null) {
			if (head.val != index.val) {
				index.next = head;
				index = index.next;
			}
			head = head.next;
		}
		index.next = null;
		return newHead.next;
	}

}
